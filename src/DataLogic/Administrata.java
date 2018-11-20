package DataLogic;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Functions.AdministrataFunctions;

public class Administrata extends Person implements AdministrataFunctions{

	private int access;
	private String fakulteti;
	public Administrata() {
		super();
	}
	public Administrata(String _ID,String _emri, String _mbiemri,String _email,String _pass,String _tel,int acc,String fk){
		super(_ID,_emri,_mbiemri,_email,_pass,_tel);
		this.access = acc;
		this.fakulteti = fk;
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
	public String getFakulteti() {
		return fakulteti;
	}
	public void setFakulteti(String fakulteti) {
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

}
