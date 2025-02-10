package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest4 {
	public static void main(String[] args) {
		// nums의 1부터 10까지의 난수를 10개 추가해주시고
		// nums의 각 index에 어떤 값이 있는데 출력
		boolean isDuple = false;
		ArrayList<Integer> nums = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int randomNums = (r.nextInt(10) + 1);
			int sameNum = nums.indexOf(randomNums);
			if (sameNum == -1) {
				nums.add(randomNums);
				isDuple = true;
				if(isDuple) {
					System.out.println("nums[" + i + "]=" + nums.get(i));
				}
			} else {
				i--;
			}
			
		}
	}
}
