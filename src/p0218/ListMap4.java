package p0218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap4 {
	public static void main(String[] args) {
		String[] columns = { "UI_NUM", "UI_NAME", "UI_ID", "UI_PWD" };
		String[] datas = { "4,성룡,sung,1234", "5,홍길동,hong,1234", "6,홍길동,hong,1234", "7,홍길동,hong,1234" };
		List<Map<String, String>> users = new ArrayList<>();
		for (String data : datas) {
			String[] usersData = data.split(",");
			Map<String, String> user = new HashMap<>();
			for (int i = 0; i < columns.length; i++) {
				user.put(columns[i], usersData[i]);
				{

				}
				users.add(user);
			}

		}
		for (Map<String, String> user : users) {
			System.out.println(user);
		}

	}
}
