package p0217;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectUserInfo {
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
			try {
				con = DriverManager.getConnection(url,user,password);
				Statement stmt = con.createStatement();
				String sql = "SELECT UI_NUM,UI_NAME,UI_PWD,UI_ID FROM USER_INFO";
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {
					int number = rs.getInt("UI_NUM");
					String name = rs.getString("UI_NAME");
					int pwd = rs.getInt("UI_PWD");
					String id = rs.getString("UI_ID");
					System.out.println(number+","+name+","+pwd+","+id);
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if (con!=null) {
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
	}
}
