package p0218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap5 {
	public static void main(String[] args) {
		String[] columns = { "name", "age", "id" };
		String[] data = { "홍길동,22,id", "임꺽정,33,lim", "유관순,16,yu" };
		List<Map<String, String>> users = new ArrayList<>();
		for (String datas : data) {
			Map<String, String> map = new HashMap<>();
			String[] usersData = datas.split(",");
			for (int i = 0; i < columns.length; i++) {
				map.put(columns[i], usersData[i]);
				}
			users.add(map);
			}
		for(Map<String,String> user:users) {
			System.out.print(user);
		}
	}
}
