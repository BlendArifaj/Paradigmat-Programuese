package DataLogic;
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

}
