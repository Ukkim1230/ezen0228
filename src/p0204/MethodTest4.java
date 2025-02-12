package p0204;

import java.util.Scanner;

public class MethodTest4 {
	int coffeePrice = 1000;
	int getCoffee(int money) {
		return money- coffeePrice;
	}
	public static void main(String[]args) {
		MethodTest4 mt = new MethodTest4();
		int chage = mt.getCoffee(2000);
		
		System.out.print("잔돈은"+chage+"원입니다.");
		//get coffee를 2000을 내고 호출했을때
		//커피 값을밴 나머지 잔돈을 출력하는 코딩
		
	}
}
