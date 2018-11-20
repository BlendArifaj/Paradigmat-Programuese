package DataLogic;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Universiteti {
	private int ID;
	private String emri;
	private List<Fakulteti> fakultetet;
	public Universiteti() {
		
	}
	public Universiteti(String emri){
		this.emri = emri;
		this.inicializoUniversitetin(this.emri);
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
		try {
			DBConnect objDB = new DBConnect("FIEKDB");
			List<Object> param = new ArrayList<Object>();
			param.add(this.ID);
			ResultSet res = objDB.executeProcedure("getFakultetet", param);
			while(res.next()) {
				Fakulteti newFk = new Fakulteti(res.getString("id"),res.getString("emri"),this,res.getString("adresa"));
				fakultetet.add(newFk);
			}
			if(!objDB.isOk) {
				return null;
			}
		} catch (Exception e) {
			return null;
		}
		return fakultetet;
	}
	public void inicializoUniversitetin(String emri) {
		try {
			DBConnect objDB = new DBConnect("FIEKDB");
			List<Object> param = new ArrayList<Object>();
			param.add(emri);
			ResultSet res = objDB.executeProcedure("getUniversiteti", param);
			while(res.next()) {
				this.ID = res.getInt("id");
				this.emri = res.getString("universiteti");
			}
			this.fakultetet = this.fakultetet();
			objDB.terminate();
		} catch (Exception e) {
		
		}
	}
}
