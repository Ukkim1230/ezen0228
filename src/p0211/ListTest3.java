package p0211;

import java.util.ArrayList;

public class ListTest3 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(7);
		nums.add(1);
		nums.add(5);
		int min = nums.get(0);
		int idx = 0;
		for (int i = 1; i < nums.size(); i++) {
			if (min > nums.get(i)) {
				min = nums.get(i);
				idx = i;
			}
		}
		int tmp = nums.get(0);
		nums.set(0, nums.get(idx));
		nums.set(idx, tmp);
		System.out.println(nums);
		//선택 정렬
		
	}
}
