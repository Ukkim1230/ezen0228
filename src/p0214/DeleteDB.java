package p0214;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDB {
	
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
		
		try {
			Connection con = DriverManager.getConnection(url, user,user);
			Statement stmt = con.createStatement();
			String sql = "DELETE from FOOD_INFO WHERE FI_NUM=102";
			int result = stmt.executeUpdate(sql);
			if (result>= 1) {
				System.out.println("삭제 완료");
			}else {
				System.out.println("삭제가 안됨");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
