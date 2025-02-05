package p0204;

import java.util.Random;

public class Lotto {
//중복 안되게 하기
	public static void main(String[] args) {
		Random r = new Random();
		int nums[] = new int[6];
		
		for (int i = 0; i < nums.length; i++) {
			boolean isDuple = false;
			nums[i] = r.nextInt(6) + 1;
			int tmp = nums[i];
			for (int j = 0; j < i; j++) {
				if (nums[j] == nums[i]) {
					i--;
					isDuple = true;
					break;
				}
			}
			if(!isDuple) {
				System.out.print(nums[i] + ",");
			}
		}
	}
}
