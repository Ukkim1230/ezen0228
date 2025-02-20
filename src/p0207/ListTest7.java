package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest7 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		Random r = new Random();
		
		// nums 1부터 100까지 난수를 총 10개 추가해주세요
		// 반복문을 사용해서 출력을 해주는데
		// 해당 값에 3이나 6이나 7이라는 숫자가 있다면 짝을 출력해주세요
		while(nums.size()<10) {
			nums.add(r.nextInt(10)+1);
			if (r.nextInt(10)+1%10==3 || r.nextInt(10)+1/10==3 ||r.nextInt(10)+1%10==6 ||r.nextInt(10)+1/10==6 ||r.nextInt(10)+1%10==9 ||r.nextInt(10)+1/10==9   ) {
				System.out.print("짝");
			}else {
			
			}
			
		}
	}

}
