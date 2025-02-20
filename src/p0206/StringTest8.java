package p0206;

import java.util.Scanner;

public class StringTest8 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("1부터 45까지의 6개의 숫자를 ,를 기준으로 입력해주세요 : ");
		String str = s.nextLine();
		System.out.println("니가 쓴 숫자들 : "+ str);
		
		String newString[] = str.split(",");
		//,를 기준으로 분리하여
		//int[] num에 저장하고
		//출력해주세요.
		for (int i=0;i<newString.length;i++) {
		
		int nums[] = new int[newString.length];
		nums[i] = Integer.parseInt(newString[i]);
		System.out.println(i);
		}
		//스캐너 클래스를 이용해서 
		//사용자에게 1-45까지의 숫자를 "," 기준으로 6개 입력받아 
		//int[]	 lotto에 저장하여 위에서 생성된 nums와 비교하여 몇개의 숫자가 맞았는지 출력하는 코드를 완성하세요
		
	}
}
