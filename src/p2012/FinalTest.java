package p2012;

public class FinalTest {
	public static final class Example{
		//상속 못한다 예시) String
	}
	final int I = 0;
	public static void main(String[] args) {
		int j = 1; //변수
		final int i = 1; //상수
		//상수는 앞 글자 대문자로 쓰기 예)ExamTest
		System.out.print(i);
		FinalTest ft = new FinalTest();
		System.out.print(ft.I);
		
	}
}
