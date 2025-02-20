package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest2 {
	public static void main(String[]args) {
		ArrayList<Integer> nums = new ArrayList<>();
		Random r = new Random();
		for(int i=0;i<10;i++) {
			nums.add(r.nextInt(100)+1);
		}
		System.out.println(nums);
		//처음부터 끝가지 순서대로 입력을 하거나 출력할때 제일 빠르다
		//단점 인덱스를 지우면 작업을 여러번 하게 된다
		
		nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		int idx = nums.indexOf(1);
		System.out.println(idx); //0
		idx = nums.indexOf(3);
		System.out.println(idx); //2
		idx = nums.indexOf(4);
		System.out.println(idx); //-1
		
		
		int[] nums2 = new int[] {1,2,3,};
		int findNum = 3;
	}
}
