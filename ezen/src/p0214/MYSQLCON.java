package p0214;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MYSQLCON {
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
			Connection con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO FOOD_INFO(FI_NAME,FI_PRICE)";
			sql += "VALUES('돈까스',6000)";
			int result = stmt.executeUpdate(sql);
			if (result>=1) {
				System.out.println("입력 성공");
			}else {
				System.out.print("입력 실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
