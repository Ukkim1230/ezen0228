package p0218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap2 {
	static List<Map<String,String>> getUserInfo() {
		ArrayList<Map<String,String>> list = new ArrayList();
		Map<String,String> map = new HashMap<>();
		map.put("year", "2018");
		map.put("week","2");
		map.put("TV", "2301");
		map.put("online", "378");
		map.put("Newspaper", "692");
		list.add(map);
		map = new HashMap<>();
		map.put("year", "2018");
		map.put("week", "11");
		map.put("TV", "445");
		map.put("online", "393");
		map.put("Newspaper", "451");
		list.add(map);
		map = new HashMap<>();
		map.put("year", "2018");
		map.put("week", "2");
		map.put("TV", "172");
		map.put("online", "459");
		map.put("Newspaper", "693");
		list.add(map);
		map = new HashMap<>();
		map.put("year", "2018");
		map.put("week", "11");
		map.put("TV", "1808");
		map.put("online", "693");
		map.put("Nespaper", "584");
		list.add(map);
		
		return list;
	}
	public static void main(String[]args) {
		List<Map<String,String>> users = getUserInfo();
		for(Map<String,String> user:users) {
			System.out.print(" year:"+user.get("year"));
			System.out.print(" ,week:"+user.get("week"));
			System.out.print(" ,TV:"+user.get("TV"));
			System.out.print(" ,online:"+user.get("online"));
			System.out.println(" ,Nespaper:"+user.get("Newspaper") );
		}
		
		
	}
	
}
