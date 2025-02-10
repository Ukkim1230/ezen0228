package p0210.review;

import java.util.Random;
import java.util.Scanner;

public class ForTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		int count = 1;
		while (true) {
			System.out.print("숫자를 입력하시오");
			String myNumber = scan.nextLine();
			int intMyNumber = Integer.parseInt(myNumber);
			if (intMyNumber == randomNumber) {
				System.out.print(count +"만에 맞추었습니다");
			}else if (intMyNumber<randomNumber) {
				System.out.println("업");
			}else if (intMyNumber>randomNumber) {
				System.out.println("다운");
			}count++;
		}
	}
}
