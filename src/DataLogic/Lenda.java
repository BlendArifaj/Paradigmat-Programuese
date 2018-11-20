package DataLogic;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Lenda {
	private int ID;
	private String lenda;
	public Lenda() {
		
	}
	public Lenda(String Lenda) {
		
	}
	public int getID() {
		return this.ID;
	}
	public void setID(int iD) {
		this.ID = iD;
	}
	public String getLenda() {
		return this.lenda;
	}
	public void setLenda(String lenda) {
		this.lenda = lenda;
	}
	public boolean insertLenda() {
		//PROCEDURA
		try {
			DBConnect objDB = new DBConnect("FIEKDB");
			List<Object> param = new ArrayList<Object>();
			param.add(this.lenda);
			ResultSet res = objDB.executeProcedure("insertLenda", param);
			objDB.terminate();
			if(!objDB.isOk) {
				return false;
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public void getLenden(String lenda) {
		//PROCEDURA
				try {
					DBConnect objDB = new DBConnect("FIEKDB");
					List<Object> param = new ArrayList<Object>();
					param.add(this.lenda);
					ResultSet res = objDB.executeProcedure("getLendaEmri", param);
					while(res.next()) {
						this.ID = res.getInt("id");
						this.lenda = res.getString("lenda");
					}
					objDB.terminate();
				} catch (Exception e) {

				}
	}

	
}
