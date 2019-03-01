package DataLogic;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class Universiteti {
	private int ID;
	private String emri;
	private List<Fakulteti> fakultetet;
	private Enumeration<String> universitetet;
	public Hashtable<Integer, String> univeristetetIDs = new Hashtable<Integer, String>();
	public Universiteti() {
		
	}
	public Universiteti(String emri){
		this.emri = emri;
		this.inicializoUniversitetin(this.emri);
	}
	public Enumeration<String> getUniversitetet() {
		DBConnect objDB = new DBConnect("FIEKDB");
		try {
			List<Object> param = new ArrayList<Object>();
			ResultSet res = objDB.executeProcedure("getAllUniversitetet", param);		
			while(res.next()) {
				univeristetetIDs.put(res.getInt("id"), res.getString("universiteti"));	
			}
			res.close();
			objDB.terminate();
		} catch (Exception e) {
			objDB.terminate();

		}
	        this.universitetet = univeristetetIDs.elements(); 
	        
	        return this.universitetet;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getEmri() {
		return emri;
	}
	public void setEmri(String emri) {
		this.emri = emri;
	}
	public List<Fakulteti> getFakultetet() {
		return fakultetet;
	}
	public void setFakultetet(List<Fakulteti> fakultetet) {
		this.fakultetet = fakultetet;
	}
	public List<Fakulteti> fakultetet(){
		List<Fakulteti> fakultetet = new ArrayList<Fakulteti>();
		DBConnect objDB = new DBConnect("FIEKDB");
		try {
			List<Object> param = new ArrayList<Object>();
			param.add(this.ID);
			ResultSet res = objDB.executeProcedure("getFakultetetUniversiteti", param);
			while(res.next()) {
				Fakulteti newFk = new Fakulteti(res.getString("id"),res.getString("emri"),this,res.getString("adresa"));
				fakultetet.add(newFk);
			}
			res.close();
			objDB.conn.close();
			objDB.cstmt.close();
			objDB.terminate();
		} catch (Exception e) {
			objDB.terminate();
			return null;
		}
		return fakultetet;
	}
	public void inicializoUniversitetin(String emri) {
		DBConnect objDB = new DBConnect("FIEKDB");
		try {
			List<Object> param = new ArrayList<Object>();
			param.add(emri);
			ResultSet res = objDB.executeProcedure("getUniversiteti", param);
			while(res.next()) {
				this.ID = res.getInt("id");
				this.emri = res.getString("universiteti");
			}
			this.fakultetet = this.fakultetet();
			res.close();
			objDB.conn.close();
			objDB.cstmt.close();
			objDB.terminate();
		} catch (Exception e) {
			objDB.terminate();
		}
	}
	public Boolean addFakultetet(List<Fakulteti> fakulteti) {
		DBConnect objDB = new DBConnect("FIEKDB");
		try {
			for(int i = 0;i<fakulteti.size();i++) {
				List<Object> param = new ArrayList<Object>();
				param.add(fakulteti.get(i).getID());
				param.add(fakulteti.get(i).getEmri());
				param.add(this.ID);
				param.add(fakulteti.get(i).getAdresa());		
			}
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

	public Hashtable<Integer, String> getAllUniversitetet() {
		DBConnect objDB = new DBConnect("FIEKDB");
		try {
			List<Object> param = new ArrayList<Object>();
			ResultSet res = objDB.executeProcedure("getAllUniversitetet", param);		
			while(res.next()) {
				univeristetetIDs.put(res.getInt("id"), res.getString("universiteti"));	
			}
			res.close();
			objDB.conn.close();
			objDB.cstmt.close();
			objDB.terminate();

		} catch (Exception e) {
			objDB.terminate();

		}
	        this.universitetet = univeristetetIDs.elements(); 
	        /*
	        while (e.hasMoreElements()) { 
	            System.out.println(e.nextElement()); 
	        } 
		*/
	        return this.univeristetetIDs;
	}	
}
