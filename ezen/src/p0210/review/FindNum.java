package p0210.review;

import java.util.Random;
import java.util.Scanner;

public class FindNum {
	public static void main(String[]args) {
		Random raw = new Random();
		Scanner scan = new Scanner(System.in);
		int randomNumber = raw.nextInt(10)+1;
		int count = 1;
		while(true) {
			String myNumber = scan.nextLine();
			String stringRandomNumber = Integer.toString(randomNumber);
			if(myNumber.equals(stringRandomNumber)) {
				System.out.println(count+"만에 맞추었다");
				break;
			}
			count++;
		}System.out.print("끝");
	}
}
