package p0206;


class Father {
	
	public Father() {
		void work() {
		System.out.println("아빠가 일합니다");
	}
};
}
public class OverRiding extends Father{

	public static void main(String[] args) {
		OverRinding o = new OverRiding();
		Father f = new Father();
		Father f = new OverRiding();

	}
}
