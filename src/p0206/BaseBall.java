package p0206;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		// int[] nums라는 배열변수에 0 -9 까지의 난수 입력후 아래에서 비교하여 볼 스트라이크 출력하고 3개 숫자와 자리수까지 다 맞으면
		// 아웃이라고 출력 반복문이 끝나면 됩니다
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int[] nums = new int[3];
		/*
		 * myNum= 2,3,4
		 * MyNums = 1,2,3
		 */
		int strike = 0;
		int ball = 0;
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(10); // 1,2,1
			for (int j = 0; j < i; j++) {
				if (nums[i] == nums[j]) {
					i--;
					break;
				}
				System.out.print(nums[i]);
			}
			
			while (true) {
				System.out.print("숫자 3개");
				String num = s.nextLine();
				System.out.println("니가 쓴 숫자 : " + num);
				if (1 == 1) {
					break;
				}
			}
			System.out.println("게임의 끝났습니다.");
		}
	}
}
