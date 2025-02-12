package p0211;

import java.util.HashMap;

public class MapTest3 {
	public static void main(String[]args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("age", "33");
		map.put("adress", "한양");
		map.put("job", "도적");
			System.out.print(map);
			
			
		
		//ArrayList의 장점 순서대로 추가하고 순서대로 제거 할 떄 가장 빠르다 순서대로 출력할 때 사용
		//ArrayList는 구성원(Element)가 중요하다	
		//HashMap는 키(kye)와 벨류(Value)가 가장 중요하다
		//HashMap는 순서대로 출력되지 않음	
		
		
	}
}
