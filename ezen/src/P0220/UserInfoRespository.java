package P0220;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInfoRespository {
	public userInfoVO selectFoodInfo (userInfoVO userInfo) {
		String sql= "SELECT FI_NAME,FI_PRICE FROM FOOD_INFO WHERE 1=1";
		if(userInfo != null) {
			if (userInfo.getUiName()!= null && userInfo.getUiName().length() !=0 ) {
				sql += "AND FI_NAME LIKE CONCAT('%',?,'%')";
			}
			if(userInfo.getUiId() != null && userInfo.getUiId().length() != 0)
				
		}
		
		
		
		try(Connection con = DBCon.getcon();
				PreparedStatement ps = con.prepareStatement(sql);){
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userInfo;
	}
}
