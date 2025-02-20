package p0219;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInfoCRUD {
	public int insertUserInfo(String uiName, String uiId, String uiPwd) {
		String sql = "INSERT INTO USER_INFO(UI_NAME,UI_ID,UI_PWD) VALUES('%S','%S','%S')";
		sql = String.format(sql, uiName, uiId, uiPwd);
		try (Connection con = DBCon.getcon(); Statement stmt = con.createStatement();) {
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int updateUserInfo(int uiNum, String uiName, String uiId, String uiPwd) {
		String sql ="UPDATE USER_INFO "
				+ "SET UI_NAME='%s',"
				+ " UI_ID='%s', "
				+ "UI_PWD='%s' "
				
				+ "WHERE UI_NUM='%d'";;
		sql = String.format(sql,  uiName, uiId, uiPwd, uiNum);
		try (Connection con = DBCon.getcon(); Statement stmt = con.createStatement();) {
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int deleteUserInfo(int uiNum) {
		String sql = "DELETE FROM USER_INFO WHERE UI_NUM=%d";
		sql = String.format(sql, uiNum);
		try (Connection con = DBCon.getcon(); Statement stmt = con.createStatement();) {
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public List<Map<String, String>> selectUserInfo(String type,String str) {
		List<Map<String, String>> userInfos = new ArrayList<>();
		String sql = "SELECT UI_NUM,UI_NAME,UI_ID,UI_PWD FROM USER_INFO";
		//"1" => UI_NAME, "2" => UI_ID "3" => UI_PWD;
		
		if("1".equals(type)) {
			sql += " WHERE UI_NAME LIKE '%" + str+ "%'";
		}else if("2".equals(type)) {
			sql += " WHERE UI_ID LIKE '%" + str +"%'";
 		}else if("3".equals(type)) {
 			sql += " WHERE UI_PWD LIKE '%" + str + "%'";
 		}
		try (Connection con = DBCon.getcon();
				Statement stmt = con.createStatement();) {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Map<String, String> userInfo = new HashMap<>();
				userInfo.put("UI_NUM", rs.getString("UI_NUM"));
				userInfo.put("UI_NAME", rs.getString("Ui_NAME"));
				userInfo.put("UI_ID", rs.getString("UI_ID"));
				userInfo.put("UI_PWD", rs.getString("UI_PWD"));
				userInfos.add(userInfo);
				return userInfos;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return userInfos;
	}
	public static List<Map<String,String>> selectUserInfo2(String type,String str) {
		List<Map<String,String>> userInfos = new ArrayList<>();
		String sql = "SELECT UI_NUM,UI_NAME,UI_ID,UI_PWD FROM USER_INFO";
		if("1".equals(type)) {
			sql += " WHERE UI_NAME LIKE CONCAT('%',?,'%')";
		}else if ("2".equals(type)) {
			sql += " WHERE UI_ID LIKE CONCAT ('%',?,'%')";
		}else if ("3".equals(type)) {
			sql += " WHERE UI_PWD LIKE CONCAT ('%',?,'%')";
		}
		try(Connection con = DBCon.getcon();
				PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setString(1, str);
			try(ResultSet rs = ps.executeQuery()) {
				while(rs.next()) {
					Map<String, String> userInfo = new HashMap<>();
					userInfo.put("UI_NUM", rs.getString("UI_NUM"));
					userInfo.put("UI_NAME", rs.getString("Ui_NAME"));
					userInfo.put("UI_ID", rs.getString("UI_ID"));
					userInfo.put("UI_PWD", rs.getString("UI_PWD"));
					userInfos.add(userInfo);
					return userInfos;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userInfos;
	}

	public static void main(String[] args) {
		UserInfoCRUD cuic = new UserInfoCRUD();
		//int result = cuic.insertUserInfo("이승현", "lee", "1234");
		//System.out.print("입력한 갯수: " + result);
		//result = cuic.updateUserInfo(5, "윤석열", "yoon", "1111");
		//System.out.print("업데이트 갯수:" + result);
		List<Map<String, String>> userInfos = cuic.selectUserInfo2("1","김");
		 for(Map<String,String>userInfo:userInfos) {
			 System.out.print(userInfo);
		 }

	}
}
