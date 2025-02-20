package p0204;

class Test {
	static int num1 = 1;
	int num2 = 2;//접근제어가 없으면 default//
}
public class StaticTest3 {
	public static void main(String[]args) {
		Test t = new Test();
		System.out.println(Test.num1);
		System.out.println(t.num2);
	}
}
