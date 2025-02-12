package p0211;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest4 {
	public static void main(String[]args) {
		HashMap<String,String> map = new HashMap<>();
		
		String str="이름";
		String str1="나이";
		String str2="주소";
		
		//김응룡
		map.put(str, "김은룡");
		map.put(str1, "35");
		map.put(str2, "광주");
		//선동렬
		HashMap<String,String>map2 = new HashMap<>();
		map2.put(str, "선동렬");
		map2.put(str1, "29");
		map2.put(str2, "부산");
		//이적
		HashMap<String,String>map3 = new HashMap<>();
		map3.put(str, "이적");
		map3.put(str1, "40");
		map3.put(str2, "서울");
		//김동률
		HashMap<String,String>map4 = new HashMap<>();
		map4.put(str, "김동률");
		map4.put(str1, "7");
		map4.put(str2, "서울");
		System.out.print(map);
		System.out.print(map2);
		System.out.print(map3);
		System.out.print(map4);
		ArrayList<HashMap<String,String>> maps = new ArrayList<>();
		maps.add(map);
		maps.add(map2);
		maps.add(map3);
		maps.add(map4);
		System.out.print(maps);
		
		
	}
}
