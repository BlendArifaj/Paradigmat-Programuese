package DataLogic;
import java.sql.*;
import java.util.List;

import javax.swing.JOptionPane;

public class DBConnect{

	public static Boolean isOk = false;
	public DBConnect(String dbname) {
	}
	
	public static Connection Connect2DB(String dbname){
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
	
	public static String getParam(int num) {
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
	

	
	public static ResultSet executeProcedure(Connection conn,CallableStatement cstmt,String procName,List<Object> parameters){
		try{
			if(parameters==null) {
				String text = "{call "+procName+"()}";
				cstmt = conn.prepareCall(text);
				cstmt.execute();
				ResultSet res =  cstmt.getResultSet();
				isOk = true;
				return res;
			}else {
				String param = getParam(parameters.size());
				String text = "{call "+procName+"("+param+")}";
				String variable = "";
				cstmt = conn.prepareCall(text);
				for(int i = 0;i<parameters.size();i++) {
					if(parameters.get(i).getClass().getSimpleName().equals("String")){
						variable = (String)parameters.get(i);
						cstmt.setString(i+1,variable);
					}else if(parameters.get(i).getClass().getSimpleName().equals("Integer")) {
						//this.cstmt.setInt(i+1, Integer.parseInt((String) parameters.get(i)));
						cstmt.setInt(i+1, (int) parameters.get(i));
					}else if(parameters.get(i).getClass().getSimpleName().equals("Boolean")) {
						cstmt.setBoolean(i+1, (boolean) parameters.get(i));
					}
				}
				cstmt.execute();
				ResultSet res =  cstmt.getResultSet();
				isOk = true;
				return res;
			}
			
		} catch (SQLException e){
			e.printStackTrace();
			isOk = false;
			return null;
		}
	}	
}