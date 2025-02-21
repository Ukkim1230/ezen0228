package p0221;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import p0219.DBCon;

public class UserInfoRepository {
	public int insertUserInfo(UserInfoVO userInfo) {
		String sql = "INSERT INTO USER_INFO(UI_NAME,UI_PWD,UI_ID) " + " VALUES(?,?,?)";
		try (Connection con = DBCon.getcon(); PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setString(1, userInfo.getUiName());
			ps.setString(2, userInfo.getUiId());
			ps.setString(3, userInfo.getUiPwd());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public int deleteUserInfo(UserInfoVO userInfo) {
		String sql = "DELETE FROM USER_INFO WHERE UI_NAME LIKE ?";
		try (Connection con = DBCon.getcon(); PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setString(1, '%' + userInfo.getUiName() + '%');
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;

	}

	public int updateUserInfo(UserInfoVO userInfo) {
		String sql = "UPDATE USER_INFO; "
				+ " SET UI_NAME = ?, "
				+ " UI_ID = ?, "
				+ " UI_PWD = ? "
				+ " WHERE UI_NUM = ?";
		try(Connection con = DBCon.getcon();
				PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setString(1, userInfo.getUiName());
			ps.setString(2, userInfo.getUiId());
			ps.setString(3, userInfo.getUiPwd());
			ps.setInt(4, userInfo.getUiNum());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return 0;
	}

	public static void main(String[] args) {
		UserInfoRepository uiRepo = new UserInfoRepository();
		UserInfoVO userInfo = new UserInfoVO();
		userInfo.setUiName("윤석열");
		userInfo.setUiId("yoon");
		userInfo.setUiPwd("y1234");
		int result = uiRepo.insertUserInfo(userInfo);
		System.out.print("입력갯수" + result);

		userInfo = new UserInfoVO();
		userInfo.setUiName("윤");
		result = uiRepo.deleteUserInfo(userInfo);
		System.out.print("삭제갯수" + result);
		
		userInfo = new UserInfoVO();
		userInfo.setUiName("이재명");
		userInfo.setUiId("lee");
		userInfo.setUiPwd("jm1234");
		userInfo.setUiNum(4);
		result = uiRepo.updateUserInfo(userInfo);
		System.out.print("수정갯수" + result);

	}
}
