package p0204;

public class Three {
	public static void main(String[] args) {
		// 1부터 100까지 출력하되
		// 숫자중 3이 들어가면 짝을 출력해 주세요
		/*
		 * 1 2 짝 ... 11 12 짝
		 */
		int i = 1;
		if (i % 10 == 3 || i / 10 == 3) {
			String nums = i + "";
			nums = "짝" + ",";
			for (; i <= 100; i++) {
				System.out.print(i + ",");
			}
		}

		for (; i <= 100; i++) {
			if (i % 10 == 3 || i / 10 == 3) {
				System.out.print("짝" + ",");
			} else
				System.out.print(i);
			// 1부터 100까지 출력하되
			// 숫자중 6이 들어간다면 짝을 출력해주세요

			for (; i <= 100; i++) {
				if (i % 10 == 6 || i / 10 == 6) {
					System.out.print("짝" + ",");
				} else {
					System.out.print(i);
				}
			}
		}
	}
}
