package p0218;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap6 {
	
	public static void main(String[]args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String user = "root";
		String password = "r1r2r3"; 
		Connection con = null;
		List<Map<String,String>> userInfo = new ArrayList<>(); 
		try {
			con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			String sqr = "Select UI_NUM,UI_NAME,UI_ID,UI_PWD FROM USER_INFO";
			ResultSet rs = stmt.executeQuery(sqr);
			while (rs.next()) {
				Map<String,String> maps = new HashMap<>();
				String uiNum = rs.getString("UI_NUM");
				String uiName = rs.getString("UI_NAME");
				String uiId = rs.getString("UI_ID");
				String uiPwd = rs.getString("UI_PWD");
				maps.put("UI_NUM", uiNum);
				maps.put("UI_NAME", uiName);
				maps.put("UI_ID", uiId);
				maps.put("UI_PWD", uiPwd);
				userInfo.add(maps);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(con!=null) {
		}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(Map<String,String>userInfos :userInfo) {
			System.out.print(userInfo);
		}
	}
}
