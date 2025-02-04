package p0204;

import java.util.Random;

public class Lotto {
//중복 안되게 하기
	public static void main(String[] args) {
		Random r = new Random();
		int nums[] = new int[6];
		for (int i = 0; i < nums.length; i++) {
			
			nums[i] = r.nextInt(45) + 1;
			int tmp = nums[i];
			for (int j = i; j <= i; j++) {
				if(tmp == nums[i]) {
					
				}
			}
		}
	}
}
