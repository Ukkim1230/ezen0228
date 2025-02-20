package p0210;

import java.util.Scanner;

class Gugudan12{
	static void gugudan1(int importNum) {
		for (int i=0;i<=9;i++) {
			System.out.print(importNum+"+"+i);
		}
	}
}
public class Gugudan4 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("단을 입력해주시오 : ");
		String numbers = scanner.nextLine();
		int importNum = Integer.parseInt(numbers);
			Gugudan12.gugudan1(importNum);
		
		
	}	
}
