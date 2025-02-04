package p0204;

public class StaticTest2 {
	int num1 =1;
	static int num2 =1;
	public static void main(String[]args) {
		StaticTest2 st = new StaticTest2();
		System.out.print(st.num2);
		st.num2=10;
		st = new StaticTest2();
		System.out.println(st.num2);
		
		StaticTest2 sd = new StaticTest2();
		System.out.print(sd.num1);
		sd.num1=10;
		sd = new StaticTest2();
		System.out.println(sd.num1);
		//non static은 새로 메모리를 만들면 초기화 되지만 static은 새로운 메모리를 만들어도 초기화 하지 않음
	}
}
