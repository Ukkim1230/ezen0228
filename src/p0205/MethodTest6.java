package p0205;

public class MethodTest6 {
	/*오버로딩의 종류
	 * 1.같은 영역이여야 한다
	 * 2.메소드 명이 같아야 한다
	 * 3.매개변수의 갯수가 다르거나 매개변수의 데이터타입이 다르거나 갯수와 데이터 타입이 같더라도 순서가 달아야 한다
	 */
	static void test(int n) {
	}

	static void test(String a) {
	}

	static void test(int n ,String a) {
	}

	static void test(String a,int n) {
	}

	static void test() {
	}

	public static void main(String[] args) {

	}
}
