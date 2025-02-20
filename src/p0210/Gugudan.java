package p0210;

public class Gugudan {
	static void printGugudan(int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.print(dan + "x" + i + "=" + (i * dan)+ ",");
			if (i != 9) {
				System.out.print(dan + "x" + i + "=" + (i * dan));
			}
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			printGugudan(i);
			System.out.println();
		}
	}
}
