package p0219;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInfoCRUD2 {
	public  int insertUserInfo(String uiName,String uiId,String uiPwd) {
		String sql = "INSERT INTO USER_INFO(UI_NAME,UI_ID,UI_PWD) VALUES(?,?,?)";
		try(Connection con = DBCon.getcon();
				PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setString(1, uiName);
			ps.setString(2, uiId);
			ps.setString(3, uiPwd);
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
		
		
		
	}
	public static void main(String[]args) {
		UserInfoCRUD2 crud = new UserInfoCRUD2();
		int result = crud.insertUserInfo("윤석열","yoon","1234");
		System.out.print("입력 횟수:" + result);
	}
}
