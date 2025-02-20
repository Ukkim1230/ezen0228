package p0206;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		int[] nums = new int[6];
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		String importNum = s.nextLine();
		String importNum2[] = importNum.split(",");
		int[] lotto = new int[importNum2.length];
		
		int answer = 0;
		// 1- 45난수 생성
		// 반복문을 이용해 nums 각 배열에 대입
		// 반복문을 사용해서 출력
		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(45) + 1;
			System.out.print(nums[i]);
			lotto[i] = Integer.parseInt(importNum2[i]);
			
		}
		
		for (int j= 0;j<nums.length;j++) {
			if(nums[j] == lotto[j]) {
				answer++;
				break;
			}
		}
		System.out.println(answer +"개 맞추었습니다");
		// 스캐너 클래스를 이용해서
		// 사용자에게 1-45까지의 숫자를 "," 기준으로 6개 입력받아
		// int[] lotto에 저장하여 위에서 생성된 nums와 비교하여 몇개의 숫자가 맞았는지 출력하는 코드를 완성하세요

	}
}
