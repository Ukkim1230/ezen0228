package p0217;

class Text {
	static {
		
	}
}
public class Scope {
	public Scope() {
		System.out.println("내 메모리를 생성했구나");
	}

	{
		System.out.println("난 언제 생성될까");
	}

	public static void main(String[] args) {
		
		System.out.println("3");
		new Scope();
	}
}