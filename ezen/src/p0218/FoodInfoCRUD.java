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

public class FoodInfoCRUD {

	static List<Map<String, String>> getFood() {
		List<Map<String, String>> foods = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String user = "root";
		String pwd = "r1r2r3";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pwd);
			Statement stmt = con.createStatement();
			String sql = "SELECT FI_NUM,FI_NAME,FI_PRICE FROM FOOD_INFO";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Map<String, String> food = new HashMap<>();
				String fiNum = rs.getString("FI_NUM");
				String fiName = rs.getString("FI_NAME");
				String fiPrice = rs.getString("FI_PRICE");
				food.put("FI_NUM", fiNum);
				food.put("FI_NAME", fiName);
				food.put("FI_PRICE", fiPrice);
			}
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (con != null) {
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	return foods;
	}
	public static int insertFoodInfo(String fiName,String fiPrice) {
		String url = "jdbc:mysql://localhost:3306/ezen";
		String user = "root";
		String pwd = "r1r2r3";
		Connection con;
		try {
			con = DriverManager.getConnection(url, user, pwd);
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO USER_INFO(FI_NAME,FI_PRICE)";
			sql += "VALUES('" + fiName + "','" + fiPrice + "')";
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public static int deleteFoodInfo(String fiNum) {
		String url = "jdbc:mysql://localhost:3306/ezen";
		String user = "root";
		String pwd = "r1r2r3";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,user,pwd);
			Statement stmt = con.createStatement();
			String sql = "DELETE FROM FOOD_INFO WHERE FI_NUM=" + fiNum;
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public static int updateFoodInfo(String fiName) {
		String url = "jdbc:mysql://localhost:3306/ezen";
		String user = "root";
		String pwd = "r1r2r3";
		try {
			Connection con = DriverManager.getConnection(url,user,pwd);
			Statement stmt = con.createStatement();
			String sql = "UPDATE FOOD_INFO";
			sql += "SET FI_NAME =" ;
			sql += "WHERE FI_NAME = '참치김밥'";
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
		
	
	public static void main(String[] args) {
		
		List<Map<String, String>> foods = getFood();
		for (Map<String, String> food : foods) {
		
			System.out.print(food);
		}
	}
}
