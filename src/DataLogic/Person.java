package DataLogic;

import java.util.List;

public class Person {
	
	protected String ID = null;
	protected String emri = null;
	protected String mbiemri = null;
	protected String email = null;
	protected String passHash = null;
	protected String tel = null;
	
	public Person() {
		
	}
	public Person(String _ID,String _emri, String _mbiemri,String _email,String _pass,String _tel) {
		this.ID=_ID;
		this.emri = _emri;
		this.mbiemri=_mbiemri;
		this.email = _email;
		this.passHash = Hash.saltedHashString(_pass, this.ID);
		this.tel=_tel;
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
	public String getMbiemri() {
		return this.mbiemri;
	}
	public void setMbiemri(String mbiemri) {
		this.mbiemri = mbiemri;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassHash() {
		return this.passHash;
	}
	public void setPass(String pass) {
		this.passHash = Hash.saltedHashString(pass, this.ID);
	}
	public String getTel() {
		return this.tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	/*
	private String fakulteti = null;
	private String qyteti = null;
	private String niveliStudimeve = null;
	private List<Punimi> punimet = null;
	


	private int access;
	private String fakulteti;
	


	private List<String> fakulteti;
	private List<String> lenda;
	 */
	
}
