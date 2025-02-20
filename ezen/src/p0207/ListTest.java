package p0207;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[]args) {
		int[] nums = new int[3];
		ArrayList<Integer> list = new ArrayList<>();
		//Integer (int)만 저장가능한 ArrayList가 데이터 타입임
		ArrayList list2 = new ArrayList();
		System.out.print(list.size());
		list2.add(1); // 인댁스 생성후 생성된 인댁스에 1을 넣는다 
		list2.add(2);
		list2.add(10);
		list2.add(22);
		list2.add(31);
		list.remove(1); // 인댁스 0번방 제거후 1번 인댁스가 0번 인댁스로 된다 즉 2는 0번쨰 인댁스가 된다
		
		System.out.print(list.size());
		
		Object[] objs = new Object[3];
	}
}
