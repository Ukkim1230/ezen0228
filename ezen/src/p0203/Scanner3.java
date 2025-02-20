package p0203;

import java.util.Scanner; //*는 util 전체를 포함 
import java.lang.*; //string,Integer 포함
public class Scanner3 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in); 
		//in은 입력 (Scanner 은 in 을 사용하여 입력) out은 출력 (print는 out의 메소드라서 출력임)
		//참조형은 변수 선언할 때 new를 붙인다 String Integer 제외
		//String str;, java.lang에 포함되는 참조형은 import 안해도 됨
		System.out.print("원하는 숫자를 입력해 주세요: ");
		String numStr = s.nextLine();
		int i = Integer.parseInt(numStr);
		i *= 10;
		System.out.print("입력하신 숫자에 10을 곱한 : "+i);
	}
}
