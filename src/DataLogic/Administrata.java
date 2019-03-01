package DataLogic;
import java.sql.Connection;
import java.sql.ResultSet;
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
		try {
			Connection conn= DBConnect.Connect2DB("fiekdb");
			DBConnect objDB = new DBConnect("FIEKDB");
			List<Object> param = new ArrayList<Object>();
			param.add(prof.getID());
			ResultSet res = objDB.executeProcedure("aprovoProfesorin", param);
			objDB.terminate();
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	public boolean aprovoStudentin(Studenti student) {
		//Procedura
		DBConnect objDB = new DBConnect("FIEKDB");
		List<Object> param = new ArrayList<Object>();
		param.add(student.getID());
		try {
			ResultSet res = objDB.executeProcedure("aprovoStudentin", param);
			objDB.terminate();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			objDB.terminate();
			return false;
		}
	}
	public void getAdministrata(String username) {
		DBConnect objDB = new DBConnect("fiekdb");
		List<Object> param = new ArrayList<Object>();
		param.add(username);
		try {
			ResultSet res = objDB.executeProcedure("getAdministrata", param);
			while(res.next()) {
				this.ID = res.getString("id");
				this.emri = res.getString("emri");
				this.mbiemri = res.getString("mbiemri");
				this.email = res.getString("email");
				this.passHash = res.getString("passhash");
				this.tel = res.getString("tel");
				this.fakulteti.inicializoFakultetin(res.getString("fakultetiId"));
				this.access = res.getInt("access");
				this.inicializoNjoftimet();
			}
			objDB.terminate();
		} catch (Exception e) {
			objDB.terminate();
		}
	}
	public Boolean addNewUniversitet(Universiteti newUni) {

		DBConnect objDB = new DBConnect("FIEKDB");
		List<Object> param = new ArrayList<Object>();
		param.add(newUni.getEmri());
		try {
			ResultSet res = objDB.executeProcedure("addNewUniversity", param);
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
	
	public Boolean addNewLenda(Lenda newLenda) {

		DBConnect objDB = new DBConnect("FIEKDB");
		List<Object> param = new ArrayList<Object>();
		param.add(newLenda.getLenda());
		ResultSet res = objDB.executeProcedure("addNewLenda", param);
		try {
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
	

}
