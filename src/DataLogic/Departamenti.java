package DataLogic;

import java.sql.CallableStatement;
import java.sql.Connection;
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
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		//DBConnect objDB = new DBConnect("FIEKDB");
		try {
			List<Object> param = new ArrayList<Object>();
			ResultSet res = DBConnect.executeProcedure(conn,cstmt,"getAllDepartamentet", param);		
			while(res.next()) {
				departamentsID.put(res.getString("id"), res.getString("departamenti"));	
			}
			res.close();
			conn.close();
			cstmt.close();
			
		} catch (Exception e) {
	
	
		}
	       return departamentsID.elements();
	}
	
	
	
	
	public Studenti getStudentWithMaxPunimeDepartament() {
		//PROCEDUREN
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		Studenti student = new Studenti();
		//DBConnect objDB = new DBConnect("FIEKDB");
		List<Object> param = new ArrayList<Object>();
		try {
			ResultSet res = DBConnect.executeProcedure(conn, cstmt,"getStudentWithMaxPunimeDepartament", param);
			while(res.next()) {
				student.getStudenti(res.getString("id"));
			}
			res.close();
			conn.close();
			cstmt.close();
			
		} catch (Exception e) {

		}
		return student;
	}
	public void inicializoDepartamentin(String emri) {
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		//DBConnect objDB = new DBConnect("FIEKDB");
		List<Object> param = new ArrayList<Object>();
		param.add(emri);
		try {
			ResultSet res = DBConnect.executeProcedure(conn,cstmt,"getDepartamenti", param);
			while(res.next()) {
				this.ID = res.getInt("id");
				this.deparamenti = res.getString("departamenti");
				this.fakulteti.inicializoFakultetin(res.getString("fakultetiId"));
			}
			res.close();
			conn.close();
			cstmt.close();
	
		} catch (Exception e) {
			
		}
	}
}

