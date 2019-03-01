package DataLogic;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class Fakulteti {
	private String ID;
	private String emri;
	private String adresa;
	private Universiteti universiteti = new Universiteti();
	private List<Departamenti> departamentet = new ArrayList<Departamenti>();
	private Enumeration<String> fakultetet;
	public Hashtable<String, String> fakultetetIDs = new Hashtable<String, String>();

	public Fakulteti(String ID, String emri,Universiteti universiteti,String adresa) {
		this.ID = ID;
		this.emri = emri;
		this.universiteti = universiteti;
		this.adresa = adresa;
		this.departamentet = this.getDepartamentet();
	}
	public Fakulteti()
	{
		
	}
	public List<Departamenti> getDepartamentet() {
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		List<Departamenti> departamentet = new ArrayList<Departamenti>();
		//DBConnect objDB = new DBConnect("FIEKDB");
		List<Object> param = new ArrayList<Object>();
		param.add(this.ID);
		try {
			ResultSet res = DBConnect.executeProcedure(conn,cstmt,"getDepartamentetFakultetit", param);
			while(res.next()) {
				Departamenti newDept = new Departamenti(res.getString("ID"),res.getString("DEPARTAMENTI"),res.getString("FAKULTETI"));
				departamentet.add(newDept);
			}
			res.close();
			conn.close();
			cstmt.close();
			
		} catch (Exception e) {

			return null;
		}
		return departamentet;
	}
	
	public Boolean insertNewFakultet() {
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		//DBConnect objDB = new DBConnect("FIEKDB");
		List<Object> param = new ArrayList<Object>();
		param.add(this.ID);
		param.add(this.emri);
		param.add(this.adresa);
		try {
			ResultSet res = DBConnect.executeProcedure(conn,cstmt,"insertFakulteti", param);
			res.close();
			conn.close();
			cstmt.close();
			return true;
		} catch (Exception e) {
			return false;
		}		
	}
	/*
	public String[][] getFakultetet(){
		try {
			DBConnect objDB = new DBConnect("FIEKDB");
			List<Object> param = new ArrayList<Object>();
			String[][] returnResult = new String[3][3];
			ResultSet res = objDB.executeProcedure("getFakultetet", null);
			int i =0;
			while(res.next()) {
				returnResult[i][0] = res.getString("id");
				returnResult[i][1]= res.getString("emri");
				returnResult[i][2]= res.getString("adresa");
				i = i+1;
			}
			objDB.terminate();
			if(!objDB.isOk) {
				return null;
			}
			return returnResult;
		} catch (Exception e) {
			return null;
		}
	}*/
	
	public String getID() {
		return this.ID;
	}
	public void setID(String iD) {
		this.ID = iD;
	}
	public String getEmri() {
		return this.emri;
	}
	public void setEmri(String emri) {
		this.emri = emri;
	}
	public String getAdresa() {
		return this.adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public void inicializoFakultetin(String fk) {
		//DBConnect objDB = new DBConnect("FIEKDB");
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		List<Object> param = new ArrayList<Object>();
		param.add(fk);
		try {
			ResultSet res = DBConnect.executeProcedure(conn,cstmt,"getFakulteti", param);
			while(res.next()) {
				this.ID = res.getString("ID");
				this.emri = res.getString("FAKULTETI");
				this.universiteti.inicializoUniversitetin(res.getString("UNIVERSITETI"));
				this.adresa = res.getString("ADRESA");
				//this.departamentet = this.getDepartamentet();
			}
			res.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public Boolean addDepartamentet(List<Departamenti> departamentet) {
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		//DBConnect objDB = new DBConnect("FIEKDB");
		try {
			for(int i = 0;i<departamentet.size();i++) {
				List<Object> param = new ArrayList<Object>();
				param.add(departamentet.get(i).getID());
				param.add(departamentet.get(i).getDeparamenti());
				param.add(this.ID);
				ResultSet res = DBConnect.executeProcedure(conn,cstmt,"addNewDepartamentFakulteti", param);	
				res.close();
			}
			conn.close();
			cstmt.close();
			if(!DBConnect.isOk) {
				return false;
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Boolean insertNewDepartament(Departamenti dept) {
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		//DBConnect objDB = new DBConnect("FIEKDB");
		try {
				List<Object> param = new ArrayList<Object>();
				param.add(dept.getID());
				param.add(dept.getDeparamenti());
				param.add(this.ID);
				ResultSet res = DBConnect.executeProcedure(conn,cstmt,"addNewDepartamentFakulteti", param);	
			conn.close();
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}
	public Enumeration<String> getFakultetet(){
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		//DBConnect objDB = new DBConnect("FIEKDB");
		try {
			List<Object> param = new ArrayList<Object>();
			ResultSet res = DBConnect.executeProcedure(conn,cstmt,"getAllFakultetet", param);		
			while(res.next()) {
				fakultetetIDs.put(res.getString("id"), res.getString("fakulteti"));	
			}
			res.close();
			conn.close();
			cstmt.close();
		} catch (Exception e) {
		}
	        this.fakultetet = fakultetetIDs.elements(); 
		return this.fakultetet;
	}
	
	public Hashtable<String, String> getAllFakultetet() {
		//DBConnect objDB = new DBConnect("FIEKDB");
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		try {
			List<Object> param = new ArrayList<Object>();
			ResultSet res = DBConnect.executeProcedure(conn,cstmt,"getAllFakultetet", param);		
			while(res.next()) {
				fakultetetIDs.put(res.getString("id"), res.getString("fakulteti"));	
			}
			res.close();
			conn.close();
			cstmt.close();
		} catch (Exception e) {

		}
	        this.fakultetet = fakultetetIDs.elements(); 
	        /*
	        while (e.hasMoreElements()) { 
	            System.out.println(e.nextElement()); 
	        } 
		*/
	        return this.fakultetetIDs;
	}
}