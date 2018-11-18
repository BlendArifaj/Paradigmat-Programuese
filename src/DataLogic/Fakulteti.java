package DataLogic;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Fakulteti {
	private String ID;
	private String emri;
	private String adresa;
	public Fakulteti(String ID, String emri,String adresa) {
		this.ID = ID;
		this.emri = emri;
		this.adresa = adresa;
	}
	public Boolean insertNewFakultet() {
		try {
			DBConnect objDB = new DBConnect("FIEKDB");
			List<Object> param = new ArrayList<Object>();
			param.add(this.ID);
			param.add(this.emri);
			param.add(this.adresa);
			ResultSet res = objDB.executeProcedure("insertFakulteti", param);
			objDB.terminate();
			if(!objDB.isOk) {
				return false;
			}
			return true;
		} catch (Exception e) {
			return false;
		}	
		
	}
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
			if(!objDB.isOk) {
				return null;
			}
			return returnResult;
		} catch (Exception e) {
			return null;
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
	public String getAdresa() {
		return this.adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

}