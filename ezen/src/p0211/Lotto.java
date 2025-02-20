package p0211;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
	public static void main(String[]args) {
	ArrayList<Integer> lotto = new ArrayList<>();
	Random rawNum = new Random();
	for (int i =0 ;i<=6;i++) {
		lotto.add(rawNum.nextInt(45)+1);
		int randomNums = rawNum.nextInt(45)+1;
		if (lotto.indexOf(randomNums)==-1) {
			lotto.add(randomNums);
			
		}
	}System.out.print(lotto);
	// 1부터 45까지의 난수 6개를 lotto에 추가
	// 단 중복제거
	// lotto값을 출력
	}
}
