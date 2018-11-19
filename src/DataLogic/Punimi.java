package DataLogic;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Functions.PunimiFunctions;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;

public class Punimi implements PunimiFunctions{
	private int ID = 0;
	private String titulli = null;
	private String profesorID = null;
	private String studentID = null;
	private String fakulteti = null;
	private String dataDorezimit = null;
	private String lenda = null;
	private boolean profesorPergjigje = false;
	private boolean administratPergjigje = false; 
	private byte[] permbajtja = null;
	
	public Punimi(int iD, String titulli, String profesorID, String studentID, String fakulteti, String dataDorezimit,
			String lenda, boolean profesorPergjigje, boolean administratPergjigje, byte[] permbajtja) {
		this.ID = iD;
		this.titulli = titulli;
		this.profesorID = profesorID;
		this.studentID = studentID;
		this.fakulteti = fakulteti;
		this.dataDorezimit = dataDorezimit;
		this.lenda = lenda;
		this.profesorPergjigje = profesorPergjigje;
		this.administratPergjigje = administratPergjigje;
		this.permbajtja = permbajtja;
	}
	public Punimi(String titulli,String profesori, String lenda,String pathToPermbajtja) {
		this.titulli = titulli;
		this.profesorID = profesori;
		this.lenda = lenda;
		this.permbajtja = this.getPermbajtja(pathToPermbajtja);
	}
	public boolean insertNewPunim() {
		try {
			DBConnect objDB = new DBConnect("FIEKDB");
			List<Object> param = new ArrayList<Object>();
			param.add(this.titulli);
			param.add(this.permbajtja);
			param.add(this.profesorID);
			param.add(this.studentID);
			param.add(this.fakulteti);
			param.add(this.lenda);
			ResultSet res = objDB.executeProcedure("insertPunim", param);
			objDB.terminate();
			if(!objDB.isOk) {
				return false;
			}
			return true;
		} catch (Exception e) {
			return false;
		}		
	}
	public byte[] getPermbajtja(String path) {
		try {
			Path pdfPath = Paths.get(path);
			return Files.readAllBytes(pdfPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTitulli() {
		return titulli;
	}
	public void setTitulli(String titulli) {
		this.titulli = titulli;
	}
	public String getProfesorID() {
		return profesorID;
	}
	public void setProfesorID(String profesorID) {
		this.profesorID = profesorID;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getFakulteti() {
		return fakulteti;
	}
	public void setFakulteti(String fakultet) {
		this.fakulteti = fakultet;
	}
	public String getDataDorezimit() {
		return dataDorezimit;
	}
	public void setDataDorezimit(String dataDorezimit) {
		this.dataDorezimit = dataDorezimit;
	}
	public String getLenda() {
		return lenda;
	}
	public void setLenda(String lenda) {
		this.lenda = lenda;
	}
	public boolean isProfesorPergjigje() {
		return profesorPergjigje;
	}
	public void setProfesorPergjigje(boolean profesorPergjigje) {
		this.profesorPergjigje = profesorPergjigje;
	}
	public boolean isAdministratPergjigje() {
		return administratPergjigje;
	}
	public void setAdministratPergjigje(boolean administratPergjigje) {
		this.administratPergjigje = administratPergjigje;
	}
	public byte[] getPermbajtja() {
		return permbajtja;
	}
	public void setPermbajtja(byte[] permbajtja) {
		this.permbajtja = permbajtja;
	}

}
