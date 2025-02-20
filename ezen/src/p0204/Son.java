package p0204;

class Human {
	void work() {
		System.out.print("일을 합니다");
	}
}

public class Son extends Human {
	void work() {
		System.out.println("아들이 일을 합니다.");
	}// Human의 work 대신 출력 오버라이딩

	void Sleep() {
		System.out.print("아들이 잡니다.");
	}

	public static void main(String[] args) {
		Son s = new Son();
		s.work();
		s.Sleep();
		Human h = new Son();
		h.work();

		Son s2 = (Son) h;
		s2.Sleep();
	}
}
