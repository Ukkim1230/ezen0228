package p0211;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest2 {
	public static void main(String[]args) {
		
		HashMap<String,String> map = new HashMap<>();
		map.put("city1", "서울");
		map.put("city2", "인천");
		map.put("city3", "부산");
		map.put("city4", "하남");
		map.put("city5", "광주");
		System.out.print(map);
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.print(key + "," + map.get(key));
			}
	}
}
