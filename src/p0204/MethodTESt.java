package p0204;

public class MethodTESt {
	int i;
	
	static void test(int i) {
		System.out.println("첫 번째 테스트");
	}
	static void test() {
		System.out.println("두 번째 테스트");
	}//매개변수가 다르면 같은 이름의 메소드라도 다르다 (오버로딩) //데이터 함수가 다른것은 같다고 본다
	static void test(String i) {
		System.out.print("세번째 테스트");
	}
	static void test(int i, String i2) {
		System.out.print("네번째 테스트");
	}
	static void test(String i, int i2) {
		System.out.print("다섯번째 테스트");
	}
	
	
	public static void main(String[] args) {
		test(1);
	}
}
