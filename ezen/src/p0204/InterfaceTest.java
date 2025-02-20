package p0204;

interface Action {
	void test();

	// interface는 메소드 바디 선언이 불가능 하다
	void sleep();
	void walk();
}

public class InterfaceTest implements Action {

	public static void main(String[] args) {
		// 인터페이스는 자바의 규격이다
		// 인터페이스를 만들기 위해서는 반드시 오버라이드 해야 한다
		// 변수는 단일고 배열 변수는 복수이다
		// 인터페이스는 복수의 변수를 하나로 묶을때 사용
	}

	@Override
	public void test() {
	}

	@Override
	public void sleep() {
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
}
