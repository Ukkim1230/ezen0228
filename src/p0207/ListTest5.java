package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest5 {
	public static void main(String[] args) {
		// nums의 1부터 10까지의 난수를 10개 추가해주시고
		// nums의 각 index에 어떤 값이 있는데 출력
		boolean isDuple = false;
		ArrayList<Integer> nums = new ArrayList<>();
		Random r = new Random();
		while (nums.size() < 10) {
			int randomNums = (r.nextInt(10) + 1);
			int sameNum = nums.indexOf(randomNums);
			if (sameNum == -1) {
				nums.add(randomNums);
			}
		}
	}
}
