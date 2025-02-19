package p0219;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodInfoCRUD {
	public int insertFoodInfo(String fiName, int fiPrice) {
		String sql = "INSERT INTO FOOD_INFO(FI_NAME,FI_PRICE) VALUES('%S','%s')";
		sql = sql.format(sql, fiName, fiPrice);
		try (Connection con = DBCon.getcon(); Statement stmt = con.createStatement();) {
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public int deleteFoodInfo(int fiNum) {
		String sql = "DELETE FROM FOOD_INFO WHERE FI_NUM=%d";
		sql = String.format(sql, 5);
		try (Connection con = DBCon.getcon(); Statement stmt = con.createStatement();) {
			return stmt.executeUpdate(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public int updateFoodInfo(int fiNum, String fiName, int fiPrice) {
		String sql = "UPDATE FOOD_INFO  "
				+ "SET FI_NAME='%s',   "
				+ "FI_PRICE='%d'  "
				+ "WHERE FI_NUM=%d";
		sql = String.format(sql, fiName, fiPrice, fiNum);
		try (Connection con = DBCon.getcon(); 
				Statement stmt = con.createStatement();) {
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public List<Map<String, String>> selectFoodInfo() {
		List<Map<String, String>> foodInfos = new ArrayList<>();
		String sql = "SELECT FI_NUM,FI_NAME,FI_PRICE FROM FOOD_INFO";
		try (Connection con = DBCon.getcon(); Statement stmt = con.createStatement();) {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Map<String, String> foodInfo = new HashMap<>();
				foodInfo.put("FI_NUM", rs.getString("FI_NUM")); // 컬럼명 변경
				foodInfo.put("FI_NAME", rs.getString("FI_NAME")); // 컬럼명 변경
				foodInfo.put("FI_PRICE", rs.getString("FI_PRICE")); // 컬럼명 변경
				foodInfos.add(foodInfo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return foodInfos;
	}

	public static void main(String[] args) {
		FoodInfoCRUD crud = new FoodInfoCRUD();
		int result = crud.insertFoodInfo("오므라이스", 7000);
		System.out.println("입력된 횟수: " + result);
		result = crud.deleteFoodInfo(5);
		System.out.println("삭제된 횟수:" + result);
		result = crud.updateFoodInfo(3, "김치볶음밥", 10000);
		System.out.println("업데이트 횟수:" + result);
		List<Map<String, String>> list = crud.selectFoodInfo();
		for (Map<String, String> lists : list) {
			System.out.print(list);
		}
	}
}
