package p0204;

class GrandFather {
	
}



class Mother extends GrandFather { 
	int money = 100000;
	int age;

	void test() {
		System.out.print("난 엄마 테스트.");
	}
}

public class Extends extends Mother {
	String address = "asdf";

	public static void main(String[] args) {
		Extends e = new Extends();
		e.test();
		System.out.print(e.age);
		System.out.print(e.money);
		// 내림 상속이 가능하다
	}
}
