package p0218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap3 {
	static List<Map<String, String>> getUserInfo() {
		ArrayList<Map<String, String>> list = new ArrayList();
		Map<String, String> map = new HashMap<>();
		map.put("UI_NAME", "홍길동");
		map.put("UI_ID", "HONG");
		map.put("UI_PWD", "1234");
		list.add(map);
		map = new HashMap<>();
		map.put("UI_NAME", "김길동");
		map.put("UI_ID", "KIM");
		map.put("UI_PWD", "1234");
		list.add(map);
		map = new HashMap<>();
		map.put("UI_NAME", "이길동");
		map.put("UI_ID", "LEE");
		map.put("UI_PWD", "1234");
		return list;
	}
		public static void main(String[]args) {
			List<Map<String,String>> users = getUserInfo();
			for (Map<String,String>user:users) {
				System.out.print("UI_NAME:"+user.get("UI_NAME"));
				System.out.print("UI_NAME:"+user.get("UI_ID"));
				System.out.print("UI_NAME:"+user.get("UI_PWD"));
			}
			
		}
	}

