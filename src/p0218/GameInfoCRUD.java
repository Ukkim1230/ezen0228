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

public class GameInfoCRUD {
	static int insertGameInfo(String giName,int giPrice,String giGenre,String giDesc) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String user = "root";
		String password = "r1r2r3";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO GAME_INFO(GI_NAME,GI_PRICE,GI_GENRE,GI_DESC)";
			sql += "VALUES('"+giName+"',"+giPrice+",'"+giGenre+"','"+giDesc+"')";
			return stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
				
		return 0;
		
	}	
	static List<Map<String,String>> getGames() {
		List<Map<String, String>> game = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String user = "root";
		String password = "r1r2r3";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			String sql = "SELECT GI_NUM,GI_NAME,GI_PRICE,GI_GENRE,GI_DESC FROM GAME_INFO";
			ResultSet result = stmt.executeQuery(sql);
			while (result.next()) {
				Map<String, String> games = new HashMap<>();
				String giName = result.getString("GI_NAME");
				String giPrice = result.getString("GI_PRICE");
				String giGenre = result.getString("GI_GENRE");
				String giDesc = result.getString("GI_DESC");
				games.put("GI_NAME", giName);
				games.put("GI_PRICE", giPrice);
				games.put("GI_GENRE", giGenre);
				games.put("GI_DESC", giDesc);
				game.add(games);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (con != null)
				;
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return game;
	}
	public static void main(String[]args) {
		int result = insertGameInfo("스타크래프트",10000,"RTS","매우 재밌다");
		System.out.print("입력된 갯수:"+result);
		
		
		List<Map<String,String>> games = getGames();
		for (Map<String,String> game:games) {
			System.out.print(game);
		}
	}

}
