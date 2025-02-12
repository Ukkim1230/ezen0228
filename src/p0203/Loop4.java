package p0203;

public class Loop4 {
	public static void main(String[] args) {
		String numStr = "3,9";
		String[] strs = new String[2];
		strs[0] = "3";
		String[] str = numStr.split(",");

		int i = Integer.parseInt(str[0]);
		int i1 = Integer.parseInt(str[1]);

		for (; i <= i1; i++) {
			System.out.print(i);
		}
		System.out.print(str[0]);
		System.out.print(str[1]);
		// strs[0] 값부터 strs[1]값까지 출력하는 반복문
	}
}
