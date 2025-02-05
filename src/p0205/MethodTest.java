package p0205;

public class MethodTest {
	void test() {
		return ;
	}
	// return 한 값은 int 데이터 타입이나 test 메소드의 데이터 타입은 void라서 리턴이 안됨 ,void는 리턴을 할 수 있으나 값을 넣지 못함
	static int test1() {
		return 1;
	}
	
	public static void main(String[]args) {
		MethodTest mt = new MethodTest();
		  mt.test();
		test1();
		//void는 저장 불가능
	}
}
