package p0210.review;

import java.util.Scanner;
//계산 하는 칸
class Minus {
	static void minus(int targetNumber1, int targetNumber2) {
		System.out.print(targetNumber1 + "-" + targetNumber2 + "=" + (targetNumber1 - targetNumber2));
	}
}

class Plus {
	static void plus(int targetNumber1, int targetNumber2) {
		System.out.print(targetNumber1 + "+" + targetNumber2 + "=" + (targetNumber1 + targetNumber2));
	}
}

class Multiple {
	static void multiple(int targetNumber1, int targetNumber2) {
		System.out.print(targetNumber1 + "x" + targetNumber2 + "=" + (targetNumber1 * targetNumber2));
	}
}

class Divide {
	static void divide(int targetNumber1, int targetNumber2) {
		System.out.print(targetNumber1 + "/" + targetNumber2 + "=" + (targetNumber1 / targetNumber2));
	}
}

public class Calcurator {
	public static void main(String[] args) {
		// 첫번쨰 숫자 입력하는 칸
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요");
		String rawNumber1 = scanner.nextLine();
		int targetNumber1 = Integer.parseInt(rawNumber1);
		// 기호 입력하는 칸
		System.out.print("기호를 입력해 주세요 (+는 더하기, -는 빼기, x는 곱하기, /는 나누기 입니다)");
		String sign = scanner.nextLine();
		for (int i = 1; i < 99; i++) {
			if (sign.equals("+")||sign.equals("-")||sign.equals("x")||sign.equals("/")) {
				break;
			} else {
				System.out.print("기호는 +,-,x,/ 만 사용가능합니다");
				sign = scanner.nextLine();
				i--;
			}	
		}
		// 두번째 숫자 입력하는 칸
		System.out.print("두번째 숫자를 입력하세요");
		String rawNumber2 = scanner.nextLine();
		int targetNumber2 = Integer.parseInt(rawNumber2);
		//각 클래스로 이동하는 칸
		if (sign.equals("+")) {
			Plus.plus(targetNumber1, targetNumber2);
		}
		if (sign.equals("-")) {
			Minus.minus(targetNumber1, targetNumber2);
		}
		if (sign.equals("x")) {
			Multiple.multiple(targetNumber1, targetNumber2);
		}
		if (sign.equals("/")) {
			Divide.divide(targetNumber1, targetNumber2);
		}
	}
}
