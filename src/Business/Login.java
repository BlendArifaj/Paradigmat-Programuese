package Business;
import DataLogic.Hash;
import DataLogic.Profesori;
import DataLogic.Studenti;
import Functions.LoginFunctions;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DataLogic.Administrata;
import DataLogic.DBConnect;

public class Login implements LoginFunctions{
	private String username = "";
	private String password = "";
	public Boolean isCorrect = false;
	private String userStoredHash = "";
	private int access = 0;
	private String lloji = "";
	public Studenti student = null;
	public Profesori profesor = null;
	public Administrata administrat = null;

	public Login(String _username,String _password) {
		this.username = _username;
		this.password = _password;
		this.setParameters();
		this.isCorrect= this.kontrolloPW();
		if(this.lloji.equals("Student")) {
			student = new Studenti();
			student.getStudenti(this.username);
		}else if(this.lloji.equals("Profesor")) {
			profesor = new Profesori();
			profesor.getProfesori(this.username);
		}else {
			administrat = new Administrata();
			administrat.getAdministrata(this.username);
		}
	}
	public Login() {

	}		
	public Boolean kontrolloPW() {
		return this.userStoredHash.equals(Hash.saltedHashString(this.password,this.username));
	}
	public void setParameters() {
		Connection conn = DBConnect.Connect2DB("fiekdb");
		CallableStatement cstmt = null;
		//DBConnect objDB = new DBConnect("FIEKDB");
		List<Object> param = new ArrayList<Object>();
		param.add(this.username);
		ResultSet res = DBConnect.executeProcedure(conn,cstmt,"getStoredHash", param);
		try {
			while(res.next()) {
				 this.userStoredHash = res.getString("Hash");
				 this.lloji = res.getString("Lloji");
				 this.access = res.getInt("Access");
			}
			conn.close();
			res.close();
		}catch (SQLException e) {
			System.out.println("AS");
			e.printStackTrace();
		}	
		
	}
	public int getAccess() {
		return this.access;
	}
	public String getLloji() {
		return this.lloji;
	}
	public String getUsername() {
		return this.username;
	}
}
