package p0210.review;

import java.util.Scanner;

public class Calcurator2 {
	static int plus1(inputNumber1,inputNumber2) {
		return inputNumber1 + inputNumber2; 
			
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int resultNumber = 0;
			if (resultNumber == 0) {

				// 첫번째 숫자 입력칸
				System.out.print("첫번째 숫자를 입력해주세요");
				String firstNumber = scan.nextLine();
				// 연산자 입력칸
				System.out.print("연산자를 입력해주세요(연산자는 +,-,x,/,% 만 가능합니다");
				String operator = scan.nextLine();
				while (true) {
					if (operator.equals("x") || operator.equals("x") || operator.equals("x") || operator.equals("x")
							|| operator.equals("x")) {
						break;
					} else {
						System.out.print("기호는 +,-,/,x,% 만 사용 가능합니다");
						operator = scan.nextLine();
					}
				}
				// 두번째 숫자 입력칸
				System.out.print("두번째 숫자를 입력해주세요");
				String secondNumber = scan.nextLine();
				//전체적인 계산
				String allNumbers = firstNumber + "," + operator + "," + secondNumber;
				String[] numbersArray = allNumbers.split(","); //allNumbers 변수에서 ,을 제거후 string 배열 생성
				int inputNumber1 = Integer.parseInt(numbersArray[0]);
				int inputNumber2 = Integer.parseInt(numbersArray[2]);
				if (numbersArray[1].equals("+")) {
					
				}
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/seonghyeon050113/Ezen.git
			}
		}
	}
}
