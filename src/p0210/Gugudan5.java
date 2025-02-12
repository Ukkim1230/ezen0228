package p0210;

import java.util.Scanner;

public class Gugudan5 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.print("단을 출력하세요 : ");
		String nums = s.nextLine();
		int numbers = Integer.parseInt(nums);
		for (int i =1 ;i<=9;i++) {
			System.out.print(numbers + "+" + i + "="  +(i*numbers)+",");
			
		}System.out.print("당신이 출력한 구구단은"+numbers+"단입니다.");
			
			//입력한 값의 구구단을 출려갛는 구구단을 완성하시오
		
	}
}
