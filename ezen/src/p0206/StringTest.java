package p0206;
class Test {
	void Test() {
		System.out.println("안녕, 난 Test라고 해.");
	}
}
public class StringTest extends Test{
	void test() {
		System.out.println("안녕하세요, 전 String Test입니다.");
	}
	public static void main(String[]args) {
		StringTest st = new StringTest();
		st.test(); //"안녕하세요, 전 String Test입니다."
		Test t = new Test();
		t.Test(); //"안녕, 난 Test라고 해."
		Test t2 = new StringTest();
		t2.Test();//"안녕하세요, 전 String Test입니다."
		Object o = new StringTest();
		//new StringTest = new Object o();// Object는 StringTest의 메모리를 인식하지 못함
	}
}
