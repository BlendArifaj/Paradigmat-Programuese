package DataLogic;
import java.sql.*;
import java.util.List;

import javax.swing.JOptionPane;

public class DBConnect{
	Connection conn=null;
	CallableStatement cstmt = null;
	public Boolean isOk = false;
	public DBConnect(String dbname) {
		this.conn = this.Connect2DB(dbname);
	}
	
	public Connection Connect2DB(String dbname){
    try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/"+dbname,"root","root");
		return conn;	
	  }catch (Exception e){
		  
             JOptionPane.showMessageDialog(null, "Error :"+e.getMessage());
			return null;
		}
	}
	
	public void ExecuteQuery() {
		
	}
	
	public String getParam(int num) {
		String returnString = "";
		for(int i = 0; i<num; i++) {
			if(i==num-1) {
				returnString = returnString +"?";
			}else {
				returnString = returnString +"?,";
			}
		}
		return returnString;
	}
	
	public void terminate() {
		try {
			this.conn.close();
			this.cstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet executeProcedure(String procName,List<Object> parameters){
		try{
			if(parameters==null) {
				String text = "{call "+procName+"()}";
				this.cstmt = this.conn.prepareCall(text);
				this.cstmt.execute();
				ResultSet res =  this.cstmt.getResultSet();
				this.isOk = true;
				return res;
			}else {
				String param = this.getParam(parameters.size());
				String text = "{call "+procName+"("+param+")}";
				String variable = "";
				this.cstmt = this.conn.prepareCall(text);
				for(int i = 0;i<parameters.size();i++) {
					if(parameters.get(i).getClass().getSimpleName().equals("String")){
						variable = (String)parameters.get(i);
						this.cstmt.setString(i+1,variable);
					}else if(parameters.get(i).getClass().getSimpleName().equals("Integer")) {
						this.cstmt.setInt(i+1, Integer.parseInt((String) parameters.get(i)));
					}else if(parameters.get(i).getClass().getSimpleName().equals("Boolean")) {
						this.cstmt.setBoolean(i+1, Boolean.parseBoolean((String)parameters.get(i)));
					}
				}
				this.cstmt.execute();
				ResultSet res =  this.cstmt.getResultSet();
				this.isOk = true;
				return res;
			}
			
		} catch (SQLException e){
			e.printStackTrace();
			this.isOk = false;
			return null;
		}
	}	
}