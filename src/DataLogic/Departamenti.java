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
	public int getDeptID() {
		return this.ID;
	}
	public void setDeptID(int deptID) {
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
		
		Studenti student = new Studenti();
		return student;
	}
	public void getBestDepartament() {
		//Procedura e cila e merr ID e departamentit, i cili ka me se shumti punime
		//Pastaj duke u bazuar ne ID e bene inicializimin e departamentit
	}
	public void inicializoDepartamentin(String emri) {
		try {
			DBConnect objDB = new DBConnect("FIEKDB");
			List<Object> param = new ArrayList<Object>();
			param.add(emri);
			ResultSet res = objDB.executeProcedure("getDepartamenti", param);
			while(res.next()) {
				this.ID = res.getInt("id");
				this.deparamenti = res.getString("deparamenti");
				this.fakulteti.inicializoFakultetin(res.getString("fakulteti"));
			}
			objDB.terminate();
		} catch (Exception e) {
		
		}
	}


}

