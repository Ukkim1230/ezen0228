package p0210.review;

public class Exam {
	String name;
	public static void main(String[]args) {
		Exam e1 = new Exam();
		e1.name = "승현";
		
		Exam e2 = new Exam();
		e2.name = "승현";
		System.out.print(e1.equals(e2));
		//object에 있는 equals는 값이 아닌 해쉬코드를 비교한다
		//String 에 있는 equals는 값을 비교한다 , object에 있는 equals를 오버라이딩
		
		
		
	}
}
