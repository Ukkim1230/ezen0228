package p0219;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class GameInfoCRUD {
	public int insertGameInfo(String giName,int giPrice,String giGenre,String giDesc){
		String sql = "INSERT INTO GAME_INFO(GI_NAME,GI_PRICE,GI_GENRE,GI_DESC)VALUES('%s','%d','%s','%s')";
		sql = String.format(sql,giName,giPrice,giGenre,giDesc);
		try (Connection con = DBCon.getcon();
				Statement stmt = con.createStatement();){
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public int deleteGameInfo(int giNum) {
		String sql = "DELETE FROM GAME_INFO WHERE GI_NUM=%d";
		sql = String.format(sql,giNum );
		try (Connection con = DBCon.getcon();
				Statement stmt = con.createStatement();){
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public static void main(String[]args) {
		GameInfoCRUD crud = new GameInfoCRUD();
		int result  = crud.insertGameInfo("오버워치",40000,"FPS","매우재미있다");
		System.out.print("입력된 횟수 :" + result);
		result = crud.deleteGameInfo(1);
		System.out.print("삭제된 횟수 :" + result);
		
	}
}
