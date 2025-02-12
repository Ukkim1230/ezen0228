package p0203;

public class Loop2 {

	public static void main(String[] args) {
		int num = 7;
		// 1부터 num까지 출력되는 반복문
		// num부터 1까지 출력되는 반복문

		for (int i = 1; i <= num; i++) {
			System.out.print(i);
		}
		System.out.println("");
		for (int i = num; num >= 1; num--) {
			System.out.print(num);
		}
	}
}
