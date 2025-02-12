package p0203;

import java.util.Scanner;

public class Scanner4 {
	public static void main(String[]args) {
		/* 1단을 출력해 주세요
		 * 
		 * 1 X 1= 1
		 * 1 X 2= 2
		 * ...
		 * ...
		 * 1 X 9= 9
		 */
		//스캐너클래스를 사용하여
		//사용자에서 숫자를 입력받아
		//해당 단을 출력하는 반복문을 완성하면 됨비낟
		//예를 들어 9를 입력했다면 9단이 완성됩니다
		System.out.print("숫자를 입력하세요 :");
		Scanner s = new Scanner(System.in);
		String numStr = s.nextLine();
		int tarNum = Integer.parseInt(numStr);
		System.out.println("당신이 입력한 숫자는" +tarNum +"단입니다" );
		for(int i=1;i<=9;i++) {
			System.out.println(tarNum + "X"+ i + "="+ (i*tarNum) );
		}
	}
}
