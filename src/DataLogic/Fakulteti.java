package DataLogic;
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
		List<Departamenti> departamentet = new ArrayList<Departamenti>();
		DBConnect objDB = new DBConnect("FIEKDB");
		List<Object> param = new ArrayList<Object>();
		param.add(this.ID);
		try {
			ResultSet res = objDB.executeProcedure("getDepartamentetFakultetit", param);
			while(res.next()) {
				Departamenti newDept = new Departamenti(res.getInt("ID"),res.getString("DEPARTAMENTI"),res.getString("FAKULTETI"));
				departamentet.add(newDept);
			}
			res.close();
			objDB.conn.close();
			objDB.cstmt.close();
			objDB.terminate();
		} catch (Exception e) {
			objDB.terminate();

			return null;
		}
		return departamentet;
	}
	
	public Boolean insertNewFakultet() {
		DBConnect objDB = new DBConnect("FIEKDB");
		List<Object> param = new ArrayList<Object>();
		param.add(this.ID);
		param.add(this.emri);
		param.add(this.adresa);
		try {
			ResultSet res = objDB.executeProcedure("insertFakulteti", param);
			objDB.terminate();
			if(!objDB.isOk) {
				return false;
			}
			res.close();
			objDB.conn.close();
			objDB.cstmt.close();
			objDB.terminate();
			return true;
		} catch (Exception e) {
			objDB.terminate();

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
	public void inicializoFakultetin(String fakulteti) {
		DBConnect objDB = new DBConnect("FIEKDB");
		List<Object> param = new ArrayList<Object>();
		param.add(fakulteti);
		try {
			ResultSet res = objDB.executeProcedure("getFakulteti", param);
			while(res.next()) {
				this.ID = res.getString("ID");
				this.emri = res.getString("FAKULTETI");
				this.universiteti.inicializoUniversitetin(res.getString("UNIVERSITETI"));
				this.adresa = res.getString("ADRESA");
				this.departamentet = this.getDepartamentet();
			}
			res.close();
			objDB.conn.close();
			objDB.cstmt.close();
			objDB.terminate();
		} catch (Exception e) {
		
			objDB.terminate();
		}
	}
	
	public Boolean addDepartamentet(List<Departamenti> departamentet) {
		DBConnect objDB = new DBConnect("FIEKDB");
		try {
			for(int i = 0;i<departamentet.size();i++) {
				List<Object> param = new ArrayList<Object>();
				param.add(departamentet.get(i).getID());
				param.add(departamentet.get(i).getDeparamenti());
				param.add(this.ID);
				ResultSet res = objDB.executeProcedure("addNewDepartamentFakulteti", param);	
				res.close();
			}
			objDB.conn.close();
			objDB.cstmt.close();
			objDB.terminate();
			if(!objDB.isOk) {
				return false;
			}
			return true;
		} catch (Exception e) {
			objDB.terminate();
			return false;
		}
	}
	
	public Enumeration<String> getFakultetet(){
		DBConnect objDB = new DBConnect("FIEKDB");
		try {
			List<Object> param = new ArrayList<Object>();
			ResultSet res = objDB.executeProcedure("getAllFakultetet", param);		
			while(res.next()) {

				fakultetetIDs.put(res.getString("id"), res.getString("fakulteti"));	
			}
			res.close();
			objDB.conn.close();
			objDB.cstmt.close();
			objDB.terminate();
		} catch (Exception e) {
			objDB.terminate();
		}
	        this.fakultetet = fakultetetIDs.elements(); 
		return this.fakultetet;
	}
	
	public Hashtable<String, String> getAllFakultetet() {
		DBConnect objDB = new DBConnect("FIEKDB");
		try {
			List<Object> param = new ArrayList<Object>();
			ResultSet res = objDB.executeProcedure("getAllFakultetet", param);		
			while(res.next()) {
				fakultetetIDs.put(res.getString("id"), res.getString("fakulteti"));	
			}
			res.close();
			objDB.conn.close();
			objDB.cstmt.close();
			objDB.terminate();
		} catch (Exception e) {
			objDB.terminate();
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