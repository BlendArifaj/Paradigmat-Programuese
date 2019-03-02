package DataLogic;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Functions.AbstractClass;
import Functions.PunimiFunctions;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;

public class Punimi extends AbstractClass implements PunimiFunctions{
	private int ID = 0;
	private String titulli = null;
	private Profesori profesori = new Profesori();
	private Studenti studenti = new Studenti();
	private Departamenti departamenti = new Departamenti();
	private String dataDorezimit = null;
	private Lenda lenda = new Lenda();
	private boolean profesorPergjigje = false;
	private boolean administratPergjigje = false; 
	private String path = null;
	
	public Punimi(int iD, String titulli, String profesorID, String studentID, String departamenti, String dataDorezimit,
			String lenda, boolean profesorPergjigje, boolean administratPergjigje,String permbajtja) {
		this.ID = iD;
		this.titulli = titulli;
		this.profesori.getProfesori(profesorID);
		this.studenti.getStudenti(studentID);
		this.departamenti.inicializoDepartamentin(departamenti);
		this.dataDorezimit = dataDorezimit;
		this.lenda.getLenden(lenda);
		this.profesorPergjigje = profesorPergjigje;
		this.administratPergjigje = administratPergjigje;
		this.path = permbajtja;
	}
	
	public Punimi(String titulli,String profesorID, String lenda,String pathToPermbajtja) {
		this.titulli = titulli;
		this.profesori.getProfesori(profesorID);
		this.lenda.getLenden(lenda);
		this.path = pathToPermbajtja;
	}
	
	public boolean insertNewPunim() {
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		//DBConnect objDB = new DBConnect("FIEKDB");
		try {
			List<Object> param = new ArrayList<Object>();
			param.add(this.titulli);
			param.add(this.path);
			param.add(this.profesori.getID());
			param.add(this.studenti.getID());
			param.add(this.departamenti.getID());
			param.add(this.lenda.getID());
			DBConnect.executeProcedure(conn,cstmt,"insertPunim", param);
			conn.close();
			return true;
		} catch (Exception e) {
			System.out.println(e);
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
	public String getPermbajtja() {
		return this.path;
	}
	public void setPath(String newPath) {
		this.path = newPath;
	}

}
