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
	private Profesori profesori = new Profesori();
	private Studenti studenti = new Studenti();
	private Departamenti departamenti = new Departamenti();
	private String dataDorezimit = null;
	private Lenda lenda = new Lenda();
	private boolean profesorPergjigje = false;
	private boolean administratPergjigje = false; 
	private byte[] permbajtja = null;
	
	public Punimi(int iD, String titulli, String profesorID, String studentID, String departamenti, String dataDorezimit,
			String lenda, boolean profesorPergjigje, boolean administratPergjigje, byte[] permbajtja) {
		this.ID = iD;
		this.titulli = titulli;
		this.profesori.getProfesori(profesorID);
		this.studenti.getStudenti(studentID);
		this.departamenti.inicializoDepartamentin(departamenti);
		this.dataDorezimit = dataDorezimit;
		this.lenda.getLenden(lenda);
		this.profesorPergjigje = profesorPergjigje;
		this.administratPergjigje = administratPergjigje;
		this.permbajtja = permbajtja;
	}
	
	public Punimi(String titulli,String profesorID, String lenda,String pathToPermbajtja) {
		this.titulli = titulli;
		this.profesori.getProfesori(profesorID);
		this.lenda.getLenden(lenda);
		this.permbajtja = this.getPermbajtja(pathToPermbajtja);
	}
	
	public boolean insertNewPunim() {
		try {
			DBConnect objDB = new DBConnect("FIEKDB");
			List<Object> param = new ArrayList<Object>();
			param.add(this.titulli);
			param.add(this.permbajtja);
			param.add(this.profesori.getID());
			param.add(this.studenti.getID());
			param.add(this.departamenti);
			param.add(this.lenda.getLenda());
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
	public Profesori getProfesori() {
		return this.profesori;
	}
	public void setProfesori(Profesori profesor) {
		this.profesori = profesor;
	}
	public Studenti getStudenti() {
		return this.studenti;
	}
	public void setStudenti(Studenti student) {
		this.studenti = student;
	}
	public Departamenti getDepartamenti() {
		return this.departamenti;
	}
	public void setDepartamenti(Departamenti departamenti) {
		this.departamenti= departamenti;
	}
	public String getDataDorezimit() {
		return dataDorezimit;
	}
	public void setDataDorezimit(String dataDorezimit) {
		this.dataDorezimit = dataDorezimit;
	}
	public Lenda getLenda() {
		return this.lenda;
	}
	public void setLenda(Lenda lenda) {
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
