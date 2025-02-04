package p0204;

public class Nine {
	public static void main(String[] args) {
		/*
		 * 1부터 100까지 출력하되 3,6,9 까 출력되면 모두 짝을 출력해주세요
		 * 
		 */
		for (int i = 1; i <= 100; i++) {
			if (i / 10 == 3 || i % 10 == 3 || i / 10 == 6 || i % 10 == 6 || i / 10 == 9 || i % 10 == 9) {
				System.out.print("짝" + ",");
			} else {
				System.out.print(i + ",");

			}
		}
		System.out.println("");
		for (int i = 1; i < 100; i++) {
			int n1 = i % 10;
			int n2 = i / 10;
			if ((n1!=0 && n1 % 3 == 0) || (n2 % 3 == 0 && i>10)) {
				System.out.println(i + ":짝");
			}
		}
	}
}
