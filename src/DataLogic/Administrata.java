package DataLogic;
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
		//PROCEDUREN
		try {
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
	public void getAdministrata(String username) {
		//PROCEDUREN
		try {
			DBConnect objDB = new DBConnect("FIEKDB");
			List<Object> param = new ArrayList<Object>();
			param.add(username);
			ResultSet res = objDB.executeProcedure("getAdministrata", param);
			while(res.next()) {
				this.ID = res.getString("id");
				this.emri = res.getString("emri");
				this.mbiemri = res.getString("mbiemri");
				this.email = res.getString("email");
				this.passHash = res.getString("passhash");
				this.tel = res.getString("tel");
				//Dhe inicializimet tjera
			}
			objDB.terminate();
		} catch (Exception e) {
		
		}
		
	}

}
