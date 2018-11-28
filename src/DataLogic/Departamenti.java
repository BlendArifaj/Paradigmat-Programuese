package DataLogic;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Functions.DepartamentiFunctions;

public class Departamenti implements DepartamentiFunctions{
	private int ID;
	private String deparamenti;
	private Fakulteti fakulteti = new Fakulteti();
	
	public Departamenti() {
		
	}
	public Departamenti(int deptID, String departamenti,String fakulteti){
		this.ID = deptID;
		this.fakulteti.inicializoFakultetin(fakulteti);
		this.deparamenti = departamenti;
	}
	public void getPunimet() {
		
	}
	public int getID() {
		return this.ID;
	}
	public void setID(int deptID) {
		this.ID = deptID;
	}
	public Fakulteti getFakulteti() {
		return this.fakulteti;
	}
	public void setFakulteti(Fakulteti fakulteti) {
		this.fakulteti = fakulteti;
	}
	public String getDeparamenti() {
		return this.deparamenti;
	}
	public void setDeparamenti(String deparamenti) {
		this.deparamenti = deparamenti;
	}
	public Studenti getStudentWithMaxPunimeDepartament() {
		//PROCEDUREN
		Studenti student = new Studenti();
		try {
			DBConnect objDB = new DBConnect("FIEKDB");
			List<Object> param = new ArrayList<Object>();
			ResultSet res = objDB.executeProcedure("getStudentWithMaxPunimeDepartament", param);
			while(res.next()) {
				student.getStudenti(res.getString("id"));
			}
			objDB.terminate();
		} catch (Exception e) {
		
		}
		return student;
	}
	public void inicializoDepartamentin(String emri) {
		try {
			DBConnect objDB = new DBConnect("FIEKDB");
			List<Object> param = new ArrayList<Object>();
			param.add(emri);
			ResultSet res = objDB.executeProcedure("getDepartamenti", param);
			while(res.next()) {
				this.ID = res.getInt("id");
				this.deparamenti = res.getString("departamenti");
				this.fakulteti.inicializoFakultetin(res.getString("fakultetiId"));
			}
			objDB.terminate();
		} catch (Exception e) {
		
		}
	}
}

