package p0205;

public class MethodTest4 {
	static void gugudan (int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan +"+"+ i + "=" + (i * dan));
		}
	}

	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			gugudan(i);
		}
		
	}
}
