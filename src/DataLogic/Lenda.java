package DataLogic;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class Lenda {
	private int ID =-123;
	private String lenda;
	
	private Enumeration<String> lendet;
	public Hashtable<Integer, String> lendetIDs = new Hashtable<Integer, String>();
	public Lenda() {
		
	}
	public Enumeration<String> getLendet(){
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;	
		try {
			List<Object> param = new ArrayList<Object>();
			ResultSet res = DBConnect.executeProcedure(conn,cstmt,"getAllLendet", param);		
			while(res.next()) {
				lendetIDs.put(res.getInt("id"), res.getString("lenda"));	
			}
			conn.close();
			res.close();
		} catch (Exception e) {
		}
	        this.lendet = lendetIDs.elements(); 
	        return this.lendet;
	        
	}
	public Lenda(String Lenda) {
		this.lenda=Lenda;
	}
	public int getID() {
		return this.ID;
	}
	public void setID(int iD) {
		this.ID = iD;
	}
	public String getLenda() {
		return this.lenda;
	}
	public void setLenda(String lenda) {
		this.lenda = lenda;
	}
	public boolean insertLenda() {
		//DBConnect objDB = new DBConnect("FIEKDB");
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		try {
			List<Object> param = new ArrayList<Object>();
			param.add(this.lenda);
			DBConnect.executeProcedure(conn,cstmt,"insertLenda", param);
			conn.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public void getLenden(String lenda) {
		//DBConnect objDB = new DBConnect("FIEKDB");
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;	
		try {
					List<Object> param = new ArrayList<Object>();
					param.add(lenda);
					ResultSet res = DBConnect.executeProcedure(conn,cstmt,"getLendaEmri", param);
					while(res.next()) {
						this.ID = res.getInt("id");
						this.lenda = res.getString("lenda");
					}
					conn.close();
					res.close();
		} catch (Exception e) {
			
		}
	}
	public Hashtable<Integer, String> getAllLendet() {
		//DBConnect objDB = new DBConnect("FIEKDB");
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;	
		try {
			List<Object> param = new ArrayList<Object>();
			ResultSet res = DBConnect.executeProcedure(conn,cstmt,"getAllLendet", param);		
			while(res.next()) {
				lendetIDs.put(res.getInt("id"), res.getString("lenda"));	
			}
			conn.close();
			res.close();
		} catch (Exception e) {
		}
	        this.lendet = lendetIDs.elements(); 
	        /*
	        while (e.hasMoreElements()) { 
	            System.out.println(e.nextElement()); 
	        } 
		*/
	        return this.lendetIDs;
	}
}
