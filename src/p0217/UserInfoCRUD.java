package p0217;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserInfoCRUD {
	private final static String URL = "jdbc:mysql://localhost:3306/ezen";
	private final static String USER = "root";
	private final static String PASSWORD = "r1r2r3";
	private final static String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private static Connection con = null;
	static {
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void close() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static int insertUserInfo(String uiName, String uiId, String uiPwd) {
		try {
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO USER_INFO(UI_NAME,UI_ID,UI_PWD)";
			sql += "VALUES('" + uiName + "','" + uiId + "','" + uiPwd + "')";
			return stmt.executeUpdate(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

	private static int deleteUserInfo(int uiNum) {
		
			try {
				Statement stmt = con.createStatement();
				String sql = "DELETE FROM USER_INFO WHERE UI_NUM="+uiNum;
				return stmt.executeUpdate(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 0;
			
			
		
	}

	public static void main(String[] args) {
		int result = insertUserInfo("홍길동", "hong", "r1r2r3");
		System.out.print("입력한 갯수: " + result);
		int result1 = deleteUserInfo(3);
		System.out.print("삭제한 갯수: " + result1);

	}
}
