package p0203;

import java.util.Scanner;

public class Scanner5 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("원하시는 숫자를 써주세요 :"); 
		String numString = s.nextLine();
		System.out.println("입력한 숫자: "+numString);
		
		// 쓴 숫자부터 시작하여 0까지 출력하는 반복문을 만들어주세요
		int tarNum = Integer.parseInt(numString);
		for(int i = tarNum;i>=1;i--) {
			System.out.println(i);
		}
	}
}
