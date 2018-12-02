package DataLogic;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Njoftimi {
	private int njoftimId;
	private String personId;
	private int punimId;
	private String njoftim;
	private Boolean statusi;
	public Njoftimi() {
		
	}
	
	public Njoftimi(int NjoftimId) {
		this.njoftimId = NjoftimId;
		this.getNjoftimi();
	}

	public Njoftimi(String personId,int PunimId, String Njoftim) {
		this.personId = personId;
		this.punimId = PunimId;
		this.njoftim = Njoftim;
	}
	public void getNjoftimi() {
		//Procedura
			try {
				DBConnect objDB = new DBConnect("FIEKDB");
				List<Object> param = new ArrayList<Object>();
				param.add(this.njoftimId);
				ResultSet res = objDB.executeProcedure("getNjoftimi", param);
				while(res.next()) {
					this.njoftimId = res.getInt("id");
					this.personId = res.getString("personId");
					this.punimId = res.getInt("punimId");
					this.njoftim = res.getString("njoftimi");
				}
				objDB.terminate();
			} catch (Exception e) {
			
			}
	}
	public Boolean shtoNjoftimin() {
		//Procedura
		try {
			DBConnect objDB = new DBConnect("FIEKDB");
			List<Object> param = new ArrayList<Object>();
			param.add(this.personId);
			param.add(this.punimId);
			param.add(this.njoftim);

			@SuppressWarnings("unused")
			ResultSet res = objDB.executeProcedure("insertNjoftim", param);
			objDB.terminate();
			if(!objDB.isOk) {
				return false;
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public int getNjoftimId() {
		return this.njoftimId;
	}
	public void setNjoftimId(int njoftimId) {
		this.njoftimId = njoftimId;
	}
	public String getId() {
		return this.personId;
	}
	public void setId(String id) {
		this.personId = id;
	}
	public int getPunimId() {
		return this.punimId;
	}
	public void setPunimId(int punimId) {
		this.punimId = punimId;
	}
	public String getNjoftim() {
		return this.njoftim;
	}
	public void setNjoftim(String njoftim) {
		this.njoftim = njoftim;
	}
	public Boolean getStatusi() {
		return this.statusi;
	}
	public void setNjoftim(Boolean _statusi) {
		this.statusi = _statusi;
	}

}
