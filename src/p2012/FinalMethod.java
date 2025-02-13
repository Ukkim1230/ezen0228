package p2012;


class Mother { 
	final void test() {
		System.out.println("엄마 테스트()");	
	}
}

public class FinalMethod extends Mother {
	void test(int a) {
		System.out.print("그냥 테스");
	}
	public static void main(String[]args) {
	FinalMethod fm = new FinalMethod();
	fm.test();//엄마 테스트
	Mother m = new FinalMethod();
	m.test();//엄마 테스트		
	}
}
