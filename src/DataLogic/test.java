package DataLogic;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Administrata newAD = new Administrata();
//		newAD.getAdministrata("ADMIN001");
		DBConnect objDB = new DBConnect("fiekdb");
		List<Object> param = new ArrayList<Object>();
		param.add("ADMIN001");
		try {
			ResultSet res = objDB.executeProcedure("getAdministrata", param);
			while(res.next()) {
				System.out.println(res.getString("id"));
			}
			objDB.terminate();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
