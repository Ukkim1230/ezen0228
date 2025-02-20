package p0218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap1 {

	static List<Map<String, String>> getUserInfo() {
		List<Map<String, String>> list = new ArrayList<>();
		HashMap<String, String> map = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("id", "hong");
		map.put("age", "22");
		list.add(map);
		map = new HashMap<>();
		map.put("이름", "유관순");
		map.put("id", "yu");
		map.put("age", "16");
		list.add(map);
		map = new HashMap<>();
		map.put("이름", "임꺽정");
		map.put("id", "lim");
		map.put("age", "33");
		list.add(map);
		return list;
	}

	public static void main(String[] args) {
		List<Map<String, String>> users = getUserInfo();
		for (int i = 0; i < users.size(); i++) {
			Map<String,String> user = users.get(i);
			System.out.print("이름: "+user.get("이름"));
			System.out.print(",아이디"+user.get("id"));
			System.out.print(",나이"+user.get("age"));
		}
		for(Map<String,String> user:users) {
			System.out.print("이름"+user.get("이름"));
			System.out.print(",아이디"+user.get("id"));
			System.out.print(",나이"+user.get("age"));
		}
	}
	
}
