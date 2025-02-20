package p0205;

import java.util.Random;
import java.util.Scanner;

public class ScannerTest2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		/*
		 * 1-10까지의 난수 생성 s의 nextLine()으로 값을 받아와서 업앤다운을 완성하면 됩니다 예) 입력한 값이 4, 난수가 9: 업
		 * 입력한 값이 3, 난수가 1: 다운 맞추면 정답
		 */
		Random r = new Random();
	
		int tarNum = r.nextInt(10) + 1;
		System.out.print("숫자 입력 칸 : ");
		for (int i = 1; i <= 2; i++) {
			String quest = s.nextLine();
			int questNum = Integer.parseInt(quest);
			System.out.print("숫자 입력 칸 : ");
			if (tarNum == questNum) {
				System.out.println("정답");
				break;
			} else if (tarNum > questNum) {
				System.out.println("다운");
				i--;
			} else if (tarNum < questNum) {
				System.out.println("업");
				i--;
			}
		}

	}
}
