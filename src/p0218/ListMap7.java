package p0218;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListMap7 {
	private static final String URL = "jdbc:mysql://localhost:3306/ezen";
	private static final String USER = "root";
	private static final String PASSWORD = "r1r2r3";
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getcon() throws SQLException{
		return DriverManager.getConnection(URL,USER,PASSWORD);
	}
	public static void main(String[]args) {
		Connection con = null;
		List<Map<String,String>> userInfo = new ArrayList<>();
		try {
			con = getcon();
			Statement stmt = con.createStatement();
			String sql = "Select UI_NUM,UI_NAME,UI_ID,UI_PDW FROM USER INFO";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
			String uiNum = rs.getString("UI_NUM");
			String uiName= rs.getString("UI_NAME");
			String uiId = rs.getString("UI_ID");
			String uiPwd = rs.getString("UI_PWD");
			
			String stringData = uiNum + ","+uiName+"," + uiId + ","+uiPwd;
			for (String datas:data) {
				String[] datas = stringData.split(",");
				
			} 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
