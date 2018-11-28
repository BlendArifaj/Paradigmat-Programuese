package DataLogic;

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
		try {
			DBConnect objDB = new DBConnect("FIEKDB");
			List<Object> param = new ArrayList<Object>();
			param.add(profesorID);
			ResultSet res = objDB.executeProcedure("getProfesori", param);
			while(res.next()) {
				this.ID = profesorID;
				this.emri = res.getString("emri");
				this.mbiemri = res.getString("mbiemri");
				this.email = res.getString("email");
				this.passHash = res.getString("passHash");
				this.tel = res.getString("tel");
				this.isAprovuar = res.getBoolean("aprovuar");
			}
			res = objDB.executeProcedure("getProfesoriLendet", param);
			this.lenda = new ArrayList<String>();
			while(res.next()) {
				this.lenda.add(res.getString("Lenda"));
			}
			res = objDB.executeProcedure("getProfesoriLendet", param);
			this.fakulteti = new ArrayList<String>();
			while(res.next()) {
				this.fakulteti.add(res.getString("Fakulteti"));
			}
			objDB.terminate();
		} catch (Exception e) {

		}
	}
	public Boolean insertNewProfesor() {
		try {
			DBConnect objDB = new DBConnect("FIEKDB");
			List<Object> param = new ArrayList<Object>();
			param.add(this.ID);
			param.add(this.emri);
			param.add(this.mbiemri);
			param.add(this.email);
			param.add(this.passHash);
			param.add(this.tel);
			@SuppressWarnings("unused")
			ResultSet res = objDB.executeProcedure("insertProfesor", param);
			objDB.terminate();
			if(!objDB.isOk) {
				return false;
			}
			return true;
		} catch (Exception e) {
			return false;
		}	
	}
	public Boolean insertProfesorLenda() {
		try {
			DBConnect objDB = new DBConnect("FIEKDB");
			@SuppressWarnings("unused")
			ResultSet res = null;
			List<Object> param = new ArrayList<Object>();
			param.add(this.ID);
			for(int i =0;i<this.lenda.size();i++) {
				param.add(this.lenda.get(i));
				res = objDB.executeProcedure("insertProfesorLenda", param);
				param.remove(1);
			}
			objDB.terminate();
			if(!objDB.isOk) {
				return false;
			}
			return true;
		} catch (Exception e) {
			return false;
		}	
	}
	public Boolean insertProfesorFakulteti() {
		try {
			DBConnect objDB = new DBConnect("FIEKDB");
			@SuppressWarnings("unused")
			ResultSet res = null;
			List<Object> param = new ArrayList<Object>();
			param.add(this.ID);
			for(int i =0;i<this.fakulteti.size();i++) {
				param.add(this.fakulteti.get(i));
				res = objDB.executeProcedure("insertProfesorFakulteti", param);
				param.remove(1);
			}
			objDB.terminate();
			if(!objDB.isOk) {
				return false;
			}
			return true;
		} catch (Exception e) {
			return false;
		}	
	}
}

