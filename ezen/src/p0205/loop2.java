package p0205;

public class loop2 {
	public static void main(String[] args) {
		// 1부터 100까지 출력하는 반복문
		for (int i = 1; i <= 100; i++) {
			// 5의 배수일때는 만세 아닐때는 숫자를 출력하면 됩니다.
			// 3이라는 숫자가 있을때는 짝
			// 위의 두가지 교차될때는 만세 짝
			if (i % 5 == 0 && (i / 10 == 3 || i % 10 == 3)) {
				System.out.print("만세짝" + ",");
			} else if (i % 5 == 0) {
				System.out.print("만세" + ",");
			} else if (i / 10 == 3 || i % 10 == 3) {
				System.out.print("짝" + ",");
			} else {
				System.out.print(i+",");
			}
		}
	}
}
