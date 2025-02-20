package P0220;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FoodInoRespository {
	public FoodInfoVO selectFoodInfo(int fiNum) {
		String sql = "SELECT FI_NUM, FI_NAME, FI_PRICE FROM FOOD_INFO " + " WHERE FI_NUM=?";
		try (Connection con = DBCon.getcon(); 
				PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setInt(1, fiNum);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				FoodInfoVO food = new FoodInfoVO();
				food.setFiNum(rs.getInt("FI_NUM"));
				food.setFiName(rs.getString("FI_NAME"));
				food.setFiPrice(rs.getInt("FI_PRICE"));
				return food;

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
public List<FoodInfoVO> selectFoodInfoList(FoodInfoVO foodInfo){
	List<FoodInfoVO> foodInfoList = new ArrayList<>();
	String sql = "SELECT FI_NUM, FI_NAME, FI_PRICE FROM FOOD_INFO WHERE 1=1";
	if(foodInfo!=null) {
		if(foodInfo.getFiName()!=null && foodInfo.getFiName().length()!=0) {
			sql += " AND FI_NAME LIKE CONCAT('%',?,'%')";
		}
		if(foodInfo.getFiPrice()!=0) {
			sql += " AND FI_PRICE=?";
		}
	}
	try (Connection con = DBCon.getcon();
			PreparedStatement ps = con.prepareStatement(sql);){
		if(foodInfo!=null) {
			if(foodInfo.getFiName()!=null && foodInfo.getFiName().length()!=0) {
				ps.setString(1, foodInfo.getFiName());
			}
			if(foodInfo.getFiPrice()!=0) {
				if(foodInfo.getFiName()!=null && foodInfo.getFiName().length()!=0) {
					ps.setInt(2, foodInfo.getFiPrice());
				}else {
					ps.setInt(1, foodInfo.getFiPrice());
				}
			}
		}
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			FoodInfoVO food = new FoodInfoVO();
			food.setFiNum(rs.getInt("FI_NUM"));
			food.setFiName(rs.getString("FI_NAME"));
			food.setFiPrice(rs.getInt("FI_PRICE"));
			foodInfoList.add(food);		
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return foodInfoList;
}

	public static void main(String[] args) {
		FoodInoRespository fiRepo = new FoodInoRespository();
		FoodInfoVO food = fiRepo.selectFoodInfo(1);
		System.out.print(food);
		food = new FoodInfoVO();
		food.setFiName("밥");
		food.setFiPrice(3500);
		List<FoodInfoVO> list = fiRepo.selectFoodInfoList(null);
		for(FoodInfoVO lists:list) {
			System.out.println(list);
		}
	}

	

	public int insertFoodInfo(FoodInfoVO foodinfo) {
		return 0;
	}

	public int updateFoodInfo(int fiNum) {
		return 0;
	}

	public int deleteFoodInfo(int fiNum) {
		return 0;
	}

}
