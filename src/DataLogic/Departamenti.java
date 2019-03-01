package DataLogic;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import Functions.DepartamentiFunctions;

public class Departamenti implements DepartamentiFunctions{
	private int ID;
	private String deparamenti;
	private Fakulteti fakulteti = new Fakulteti();
	public Hashtable<String, String> departamentsID = new Hashtable<String, String>();

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
	public Enumeration<String> getDepartamentet(){
		DBConnect objDB = new DBConnect("FIEKDB");
		try {
			List<Object> param = new ArrayList<Object>();
			ResultSet res = objDB.executeProcedure("getAllDepartamentet", param);		
			while(res.next()) {

				departamentsID.put(res.getString("id"), res.getString("departamenti"));	
			}
			res.close();
			objDB.conn.close();
			objDB.cstmt.close();
			objDB.terminate();
		} catch (Exception e) {
	
			objDB.terminate();
		}
	       return departamentsID.elements();
	}
	
	
	
	public Studenti getStudentWithMaxPunimeDepartament() {
		//PROCEDUREN
		Studenti student = new Studenti();
		DBConnect objDB = new DBConnect("FIEKDB");
		List<Object> param = new ArrayList<Object>();
		try {
			ResultSet res = objDB.executeProcedure("getStudentWithMaxPunimeDepartament", param);
			while(res.next()) {
				student.getStudenti(res.getString("id"));
			}
			objDB.terminate();
		} catch (Exception e) {
			objDB.terminate();		
		}
		return student;
	}
	public void inicializoDepartamentin(String emri) {
		DBConnect objDB = new DBConnect("FIEKDB");
		List<Object> param = new ArrayList<Object>();
		param.add(emri);
		try {
			ResultSet res = objDB.executeProcedure("getDepartamenti", param);
			while(res.next()) {
				this.ID = res.getInt("id");
				this.deparamenti = res.getString("departamenti");
				this.fakulteti.inicializoFakultetin(res.getString("fakultetiId"));
			}
			res.close();
			objDB.conn.close();
			objDB.cstmt.close();
			objDB.terminate();
		} catch (Exception e) {
			objDB.terminate();
		}
	}
}

