package p0210;

public class Gugudan2 {
	static int gugudan(int intput1, int input2) {
		return intput1 * input2;
	}
	static int num() {
		return 1;
	}

	public static void main(String[] args) {

		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int result = gugudan(i, j);
				System.out.print(i + "+" + j + "=" + result + "," );
				
			}
		}
	}
}
