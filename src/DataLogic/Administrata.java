package DataLogic;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Functions.AdministrataFunctions;

public class Administrata extends Person implements AdministrataFunctions{

	private int access;
	private Fakulteti fakulteti;
	public Administrata() {
		super();
	}
	public Administrata(String _ID,String _emri, String _mbiemri,String _email,String _pass,String _tel,int acc,String fk){
		super(_ID,_emri,_mbiemri,_email,_pass,_tel);
		this.access = acc;
		this.fakulteti.inicializoFakultetin(fk);
	}
	public String getID() {
		return ID;
	}
	public int getAccess() {
		return access;
	}
	public void setAccess(int access) {
		this.access = access;
	}
	public Fakulteti getFakulteti() {
		return fakulteti;
	}
	public void setFakulteti(Fakulteti fakulteti) {
		this.fakulteti = fakulteti;
	}
	public boolean aprovoProfesorin(Profesori prof) {
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		try {
			//DBConnect objDB = new DBConnect("FIEKDB");
			List<Object> param = new ArrayList<Object>();
			param.add(prof.getID());
			ResultSet res = DBConnect.executeProcedure(conn,cstmt,"aprovoProfesorin", param);
			conn.close();
			cstmt.close();
			res.close();
			return true;
		} catch (Exception e) {
			try {
				conn.close();
				cstmt.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			return false;
		}
		
	}
	public boolean aprovoStudentin(Studenti student) {
		//Procedura
		Connection conn= DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		//DBConnect objDB = new DBConnect("FIEKDB");
		List<Object> param = new ArrayList<Object>();
		param.add(student.getID());
		try {
			ResultSet res = DBConnect.executeProcedure(conn, cstmt,"aprovoStudentin", param);
			conn.close();
			cstmt.close();
			res.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			try {
				conn.close();
				cstmt.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return false;
		}
	}
	public void getAdministrata(String username) {
		Connection conn= DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		//DBConnect objDB = new DBConnect("fiekdb");
		List<Object> param = new ArrayList<Object>();
		param.add(username);
		try {
			ResultSet res = DBConnect.executeProcedure(conn,cstmt,"getAdministrata", param);
			while(res.next()) {
				this.ID = res.getString("id");
				this.emri = res.getString("emri");
				this.mbiemri = res.getString("mbiemri");
				this.email = res.getString("email");
				this.passHash = res.getString("passhash");
				this.tel = res.getString("tel");
				//this.fakulteti.inicializoFakultetin(res.getString("fakultetiId"));
				this.access = res.getInt("access");
				//this.inicializoNjoftimet();
			}
			conn.close();
			res.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public Boolean addNewUniversitet(Universiteti newUni) {
		Connection conn= DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		//DBConnect objDB = new DBConnect("FIEKDB");
		List<Object> param = new ArrayList<Object>();
		param.add(newUni.getEmri());
		try {
			ResultSet res = DBConnect.executeProcedure(conn,cstmt,"addNewUniversity", param);
			conn.close();
			cstmt.close();
			res.close();
			if(!DBConnect.isOk) {
				return false;
			}
			return true;
		} catch (Exception e) {
			try {
				conn.close();
				cstmt.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return false;
			}
			return false;
		}
	}
	
	public Boolean addNewLenda(Lenda newLenda) {
		Connection conn= DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		//DBConnect objDB = new DBConnect("FIEKDB");
		List<Object> param = new ArrayList<Object>();
		param.add(newLenda.getLenda());
		ResultSet res = DBConnect.executeProcedure(conn,cstmt,"addNewLenda", param);
		try {
			conn.close();
			cstmt.close();
			res.close();
			if(!DBConnect.isOk) {
				return false;
			}
			return true;
		} catch (Exception e) {
			try {
				conn.close();
				cstmt.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return false;
			}
			return false;
		}
	}
	

}
