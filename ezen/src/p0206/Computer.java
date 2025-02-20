package p0206;

class Exam {

}

public class Computer {
	static void println(Exam e) {
		String str = e.toString();
		System.out.println(str);
	}
	public static void main(String[] args) {
		Exam e = new Exam();
		println(e);
		System.out.print(e); //println은 변수.toString을 출력함 //println이 숫자를 출력할 수 있는 이유는 매개변수에 integer.toString이 있어서이다
	//toString은 클래스이름.변수 이름 + "@" + 메모리 변수로 이루어져 있음
	}
}
