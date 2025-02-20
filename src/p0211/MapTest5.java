package p0211;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapTest5 {
	public static void main(String[]args) {
		ArrayList<Map<String,Integer>> list = new ArrayList<>();
		for(int i =1;i<=2;i++) {
			HashMap<String,Integer> maps = new HashMap<>();
			maps.put("번호", i);
			list.add(maps);
			
		}
		System.out.print(list.get(0));
		System.out.print(list.get(1));
	}
}
