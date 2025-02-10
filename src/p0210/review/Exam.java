package p0210.review;

public class Exam {
	String name;
	public static void main(String[]args) {
		Exam e1 = new Exam();
		e1.name = "승현";
		
		Exam e2 = new Exam();
		e2.name = "승현";
		System.out.print(e1.equals(e2));
		
		
		
	}
}
