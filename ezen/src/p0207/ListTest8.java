package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest8 {
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<String> list = new ArrayList<>();
		// list에 1부터 100까지의 난수를 10개 집어넣고
		// 출력해주세요.
		while (list.size() < 10) {
			int s=(r.nextInt(10)+1);
			String targetNum = s + "";
			list.add(targetNum);

		}
		System.out.print(list);
	}
}
