package p0205;

class Human {
	void work() {
		System.out.print("사람이라면 일을 해야지!");
	}
}

public class Father extends Human {
	public static void main(String[] args) {
		Father f = new Father();
		f.work();
	}
}
