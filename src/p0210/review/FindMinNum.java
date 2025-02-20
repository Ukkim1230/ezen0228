package p0210.review;

import java.util.ArrayList;
import java.util.Random;

public class FindMinNum {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		Random r = new Random();
		// 0
		int[] arr = new int[0];
		System.out.print(arr.length);// rNum은 1부터 100까지 나올 수 있음
		System.out.print(nums.size());
		int rNum = 1; // rNum은 1부터 100까지 나올 수 있음
		while (nums.size() < 10) {
			int randomNum = r.nextInt(50) + 1;
			if (nums.indexOf(randomNum) == -1) {
				nums.add(randomNum);
			}
		}
		System.out.print(nums);// 2
	}
}
