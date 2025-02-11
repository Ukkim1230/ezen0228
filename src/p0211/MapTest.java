package p0211;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<>();
		str.add("1");
		str.add("2");
		str.add("s");
		//Arraylist는 value가 무엇을 뜻하는지
		//ArrayList는 추가된 순서대로 출력됨
		HashMap<String,String> map = new HashMap<>();
		//Map은 키를 사용하여 value가 무엇인지 알 수 있다  Map<키,value>;
		map.put("name","1");
		map.put("adress","2");
		map.put("age", "3");
		
		map.put("city", "서울");
		map.put("city", "인천");
		map.put("city", "부산");
		System.out.print(map);
		//city = 부산 출력
		//Map은 키 중복이 안 됨 
	}
}
