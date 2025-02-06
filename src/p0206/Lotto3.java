package p0206;

public class Lotto3 {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] lotto = new int[] { 2, 11, 4, 21, 33, 41 };

		int correctNum = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length; j++) {
				int targetNum = lotto[j];
				if (nums[i] == lotto[j]) {
					correctNum++;
					break;
				}
			}
		}
		System.out.println("맞은 개수 : " + correctNum);
	}
}
