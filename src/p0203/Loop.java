package p0203;

public class Loop {
	public static void main(String[]args) {
	//반복분
	//for, while, do while
		for(int i=1;i<10;i++) { 
			//for의 영역은 선언문 조건문 확장문으로 나누어짐
			//선언문 -> 조건문 -> 10라인 -> 확장문 -> 조건문 -> 10라인
			System.out.println(i);
		}
		
		int i = 1;
		while(i++<10) {
			System.out.print(i);
		}
	}
}
