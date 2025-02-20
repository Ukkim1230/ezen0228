package p0205;

import java.util.Random;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		// import java.util.Scanner; scanner 앞에 생략되어 있는거
		Scanner s = new Scanner(System.in);
		System.out.print("생각하는 숫자를 작성해주세요 : ");
		String numStr = s.nextLine();
		Random r = new Random();
		int targetNum = Integer.parseInt(numStr);
		int tar = r.nextInt(10) + 1; // 1-10난수 생성
		if (targetNum == tar) {
			System.out.println("맞음");
		} else {
			System.out.println("틀림");
		}
		System.out.print("정답은 : " + tar);
	}
}
