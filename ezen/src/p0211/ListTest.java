package p0211;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[]args) {
		ArrayList<Integer> nums = new ArrayList<>();
		//nums.set(2, 1); 있는 방에 만 쓸 수있다, 리스트에는 0번째 방밖에 없다
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.print(nums);
		int tmp = nums.get(2);
		nums.set(2, nums.get(0));
		nums.set(0, tmp);
		System.out.print(nums);
		//nums.set(1,2);
		//set에서 첫번째 칸 넣을 칸 두번째 칸 넣을 값
		//set의 데이터 타입은 Integer
		ArrayList<String> str = new ArrayList<>();
		str.set(tmp, null);//set의 데이터 타입은 string이 된다
		
				
		
	}
}
