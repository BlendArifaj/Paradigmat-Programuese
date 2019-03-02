package DataLogic;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Functions.StudentiFunctions;

public class Studenti extends Person implements StudentiFunctions{
	
	private Universiteti universiteti = new Universiteti();
	private Fakulteti fakulteti = new Fakulteti();
	private Departamenti departamenti = new Departamenti();
	private String qyteti = null;
	private String niveliStudimeve = null;
	private List<Punimi> punimet = new ArrayList<Punimi>();
	
	public Studenti(String ID,String emri,String mbiemri,String email,String pass,
			String tel, String departamenti, String qyteti,String niveliStudimeve) {
		super(ID,emri,mbiemri,email,pass,tel);
		this.departamenti.inicializoDepartamentin(departamenti);
		this.qyteti = qyteti;
		this.niveliStudimeve = niveliStudimeve;
		//this.punimet = this.getPunimet();
	}
	public Studenti() {
		super();
	}
	public Fakulteti getFakulteti() {
		return fakulteti;
	}
	public void setFakulteti(Fakulteti fakulteti) {
		this.fakulteti = fakulteti;
	}
	public String getQyteti() {
		return qyteti;
	}
	public void setQyteti(String qyteti) {
		this.qyteti = qyteti;
	}
	public String getNiveliStudimeve() {
		return niveliStudimeve;
	}
	public void setNiveliStudimeve(String niveliStudimeve) {
		this.niveliStudimeve = niveliStudimeve;
	}	
	public Universiteti getUniversiteti() {
		return universiteti;
	}
	public void setUniversiteti(Universiteti universiteti) {
		this.universiteti = universiteti;
	}
	public Departamenti getDepartamenti() {
		return departamenti;
	}
	public void setDepartamenti(Departamenti departamenti) {
		this.departamenti = departamenti;
	}
	public List<Punimi> punimet() {
		return this.punimet;
	}
	public void setPunimet(List<Punimi> punimet) {
		this.punimet = punimet;
	}

	public Boolean insertNewStudent() {
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		//DBConnect objDB = new DBConnect("FIEKDB");
		try {
			List<Object> param = new ArrayList<Object>();
			param.add(this.ID);
			param.add(this.emri);
			param.add(this.mbiemri);
			param.add(this.email);
			param.add(this.passHash);
			param.add(this.tel);
			param.add(this.departamenti.getDeparamenti());
			param.add(this.qyteti);
			param.add(this.niveliStudimeve);
			ResultSet res = DBConnect.executeProcedure(conn,cstmt,"insertStudent", param);
			conn.close();
			return true;
		}catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}	
	public List<Punimi> getPunimet(){
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		List<Punimi> returnPunimet = new ArrayList<Punimi>();
		//DBConnect objDB = new DBConnect("FIEKDB");
		try {
			List<Object> param = new ArrayList<Object>();
			param.add(this.ID);
			ResultSet res = DBConnect.executeProcedure(conn,cstmt,"getPunimet", param);
			while(res.next()) {
				//int iD, String titulli, String profesorID, String studentID, String fakulteti, String dataDorezimit,
				//String lenda, boolean profesorPergjigje, boolean administratPergjigje, byte[] permbajtja
				Punimi objP = new Punimi(res.getInt("id"),res.getString("tema"),res.getString("profesorID"),
						res.getString("StudentID"),res.getString("fakultetID"),res.getString("dataDorezimit"),
						res.getString("lenda"),res.getBoolean("profesoriPergjigje"),
						res.getBoolean("administrataPergjigje"),res.getBytes("permbajtja"));
				returnPunimet.add(objP);
			}
			conn.close();
			cstmt.close();
		
			return returnPunimet; 
		} catch (Exception e) {
			
			return null;
		}
	}
	public boolean addPunimi(Punimi newPunim) {
		newPunim.setStudenti(this);
		newPunim.setDepartamenti(this.departamenti);
		return newPunim.insertNewPunim();
	}
	public void getStudenti(String stdId){
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		
		//DBConnect objDB = new DBConnect("FIEKDB");
		try {
			List<Object> param = new ArrayList<Object>();
			param.add(stdId);
			ResultSet res = DBConnect.executeProcedure(conn,cstmt,"getStudenti", param);
			while(res.next()) {
				this.ID = res.getString("id");
				this.emri = res.getString("emri");
				this.mbiemri = res.getString("mbiemri");
				this.email = res.getString("email");
				this.passHash = res.getString("passhash");
				this.tel = res.getString("tel");
				this.niveliStudimeve = res.getString("niveliStudimeve");
				this.qyteti = res.getString("qyteti");
				this.departamenti.inicializoDepartamentin(res.getString("departamenti"));
				this.fakulteti.inicializoFakultetin(res.getString("Fakulteti"));
				this.universiteti.inicializoUniversitetin(res.getString("universiteti"));
				this.punimet = this.getPunimet();
				this.inicializoNjoftimet();
			}
			res.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public Boolean updateStuentData() {
		//DBConnect objDB = new DBConnect("FIEKDB");
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		try {
			List<Object> param = new ArrayList<Object>();
			param.add(this.ID);
			param.add(this.emri);
			param.add(this.mbiemri);
			param.add(this.email);
			param.add(this.tel);
			DBConnect.executeProcedure(conn,cstmt,"updateStudentData", param);
			conn.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Boolean updateStudentPassword(String newPass) {
		//DBConnect objDB = new DBConnect("FIEKDB");
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		try {
			List<Object> param = new ArrayList<Object>();
			param.add(this.ID);
			param.add(Hash.saltedHashString(newPass, this.ID));
			DBConnect.executeProcedure(conn,cstmt,"updatePersonPassword", param);
			conn.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
