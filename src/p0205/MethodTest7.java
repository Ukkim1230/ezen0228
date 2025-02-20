package p0205;

public class MethodTest7 {
	static int add(int max) {
		int add=0;
		for (int i = 1; i <= max; i++) {
			add += i;
		}
		return add;
	}
	public static void main(String[] args) {
		int add = add(100);
		System.out.print(add);
	}
}
