package DataLogic;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Functions.ProfesoriFunctions;

public class Profesori extends Person implements ProfesoriFunctions {
	private List<String> fakulteti;
	private List<String> lenda;
	private boolean isAprovuar = false;

	public Profesori(String ID,String emri,String mbiemri,String email,String pass,String tel,String titulli,List<String> fakulteti,List<String> lenda) {
		super(ID,emri,mbiemri,email,pass,tel);
		this.fakulteti = fakulteti;
		this.lenda = lenda;
		this.isAprovuar = false;
	}
	public Profesori(String ID,String emri,String mbiemri, String email, String pass, String tel) {
		super(ID,emri,mbiemri,email,pass,tel);
		this.isAprovuar = false;
	}
	public List<String> getLenda() {
		return this.lenda;
	}
	public void setLenda(List<String> lenda) {
		this.lenda = lenda;
	}
	public Profesori() {
		super();
	}	
	public List<String> getFakulteti() {
		return this.fakulteti;
	}
	public void setFakulteti(List<String> fakulteti) {
		this.fakulteti = fakulteti;
	}
	public void getProfesori(String profesorID) {
		//DBConnect objDB = new DBConnect("FIEKDB");
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		try {
			List<Object> param = new ArrayList<Object>();
			param.add(profesorID);
			ResultSet res = DBConnect.executeProcedure(conn,cstmt,"getProfesori", param);
			while(res.next()) {
				this.ID = profesorID;
				this.emri = res.getString("emri");
				this.mbiemri = res.getString("mbiemri");
				this.email = res.getString("email");
				this.passHash = res.getString("passHash");
				this.tel = res.getString("tel");
				this.isAprovuar = res.getBoolean("aprovuar");
				this.inicializoNjoftimet();
			}
			res = DBConnect.executeProcedure(conn,cstmt,"getProfesoriLendet", param);
			this.lenda = new ArrayList<String>();
			while(res.next()) {
				this.lenda.add(res.getString("Lenda"));
			}
			res = DBConnect.executeProcedure(conn,cstmt,"getProfesoriLendet", param);
			this.fakulteti = new ArrayList<String>();
			while(res.next()) {
				this.fakulteti.add(res.getString("Fakulteti"));
			}
		conn.close();
		cstmt.close();
		res.close();
		} catch (Exception e) {

		}
	}
	public Boolean insertNewProfesor() {
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		//DBConnect objDB = new DBConnect("FIEKDB");
		try {
			List<Object> param = new ArrayList<Object>();
			param.add(this.ID);
			param.add(this.emri);
			param.add(this.mbiemri);
			param.add(this.email);
			param.add(this.passHash);
			param.add(this.tel);
			@SuppressWarnings("unused")
			ResultSet res = DBConnect.executeProcedure(conn,cstmt,"insertProfesor", param);
			conn.close();
			cstmt.close();
			res.close();
			if(!DBConnect.isOk) {
				return false;
			}
			return true;
		} catch (Exception e) {
			return false;
		}	
	}
	public Boolean insertProfesorLenda() {
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		//DBConnect objDB = new DBConnect("FIEKDB");
		try {
			@SuppressWarnings("unused")
			ResultSet res = null;
			List<Object> param = new ArrayList<Object>();
			param.add(this.ID);
			for(int i =0;i<this.lenda.size();i++) {
				param.add(this.lenda.get(i));
				res = DBConnect.executeProcedure(conn,cstmt,"insertProfesorLenda", param);
				param.remove(1);
			}
			conn.close();
			cstmt.close();
			res.close();
			if(!DBConnect.isOk) {
				return false;
			}
			return true;
		} catch (Exception e) {
			return false;
		}	
	}
	public Boolean insertProfesorFakulteti() {
		//DBConnect objDB = new DBConnect("FIEKDB");
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		try {
			@SuppressWarnings("unused")
			ResultSet res = null;
			List<Object> param = new ArrayList<Object>();
			param.add(this.ID);
			for(int i =0;i<this.fakulteti.size();i++) {
				param.add(this.fakulteti.get(i));
				res = DBConnect.executeProcedure(conn,cstmt,"insertProfesorFakulteti", param);
				param.remove(1);
			}
			conn.close();
			cstmt.close();
			res.close();
			if(!DBConnect.isOk) {
				return false;
			}
			return true;
		} catch (Exception e) {
			return false;
		}	
	}
	
	//HashTable procedura e cila ka me i mor krejt profesoret (vetem emri) dhe si qeles, dmth menyren per me ju qas do ta kete id-n e profes
}

