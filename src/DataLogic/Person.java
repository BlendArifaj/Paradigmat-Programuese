package DataLogic;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Person {
	
	protected String ID = null;
	protected String emri = null;
	protected String mbiemri = null;
	protected String email = null;
	protected String passHash = null;
	protected String tel = null;
	protected List<Njoftimi> njoftimet = new ArrayList<Njoftimi>();
	protected List<Njoftimi> newNjoftimet = new ArrayList<Njoftimi>();
	protected boolean newNjoftim = false;
	public Person() {
		
	}
	public Person(String _ID,String _emri, String _mbiemri,String _email,String _pass,String _tel) {
		this.ID=_ID;
		this.emri = _emri;
		this.mbiemri=_mbiemri;
		this.email = _email;
		this.passHash = Hash.saltedHashString(_pass, this.ID);
		this.tel=_tel;
		this.inicializoNjoftimet();
	}
	
	public List<Njoftimi> getNewNjoftimet() {
		return newNjoftimet;
	}
	public void setNewNjoftimet(List<Njoftimi> newNjoftimet) {
		this.newNjoftimet = newNjoftimet;
	}
	public boolean isNewNjoftim() {
		return newNjoftim;
	}
	public void setNewNjoftim(boolean newNjoftim) {
		this.newNjoftim = newNjoftim;
	}
	protected void inicializoNjoftimet() {
		//DBConnect objDB = new DBConnect("FIEKDB");
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		try {
			List<Object> param = new ArrayList<Object>();
			param.add(this.ID);
			ResultSet res = DBConnect.executeProcedure(conn,cstmt,"getNjoftimetFromDB", param);
			while(res.next()) {
				Boolean statusi = res.getBoolean("statusi");
				Njoftimi objN = new Njoftimi(res.getInt("id"),
						res.getString("personId"),
						res.getInt("punimId"),
						res.getString("njoftim"),
						statusi);
				if(statusi) {
					this.njoftimet.add(objN);	
				}else {
					this.newNjoftimet.add(objN);
				}
			}
			if(this.newNjoftimet.size()>0) {
				this.newNjoftim = true;
			}else {
				this.newNjoftim = false;
			}
			conn.close();
			cstmt.close();
			res.close();
		} catch (Exception e) {

		}
	}
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
	public String getMbiemri() {
		return this.mbiemri;
	}
	public void setMbiemri(String mbiemri) {
		this.mbiemri = mbiemri;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassHash() {
		return this.passHash;
	}
	public void setPass(String pass) {
		this.passHash = Hash.saltedHashString(pass, this.ID);
	}
	public String getTel() {
		return this.tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public List<Njoftimi> getNjoftimet() {
		return this.njoftimet;
	}
	public void setNjoftimet(List<Njoftimi> njoftimet) {
		this.njoftimet = njoftimet;
	}
	public Boolean updateData() {
		//DBConnect objDB = new DBConnect("FIEKDB");
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		try {
			List<Object> param = new ArrayList<Object>();
			param.add(this.ID);
			param.add(this.emri);
			param.add(this.mbiemri);
			param.add(this.email);
			param.add(this.tel);
			DBConnect.executeProcedure(conn,cstmt,"updatePersonData", param);
			conn.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean updatePassword() {
		//DBConnect objDB = new DBConnect("FIEKDB");
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		try {
			List<Object> param = new ArrayList<Object>();
			param.add(this.ID);
			param.add(this.passHash);
			DBConnect.executeProcedure(conn,cstmt,"updatePersonPassword", param);
			conn.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/*
	private String fakulteti = null;
	private String qyteti = null;
	private String niveliStudimeve = null;
	private List<Punimi> punimet = null;
	


	private int access;
	private String fakulteti;
	


	private List<String> fakulteti;
	private List<String> lenda;
	 */
	
}
