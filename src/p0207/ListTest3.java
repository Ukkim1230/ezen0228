package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest3 {
	public static void main(String[]args) {
		ArrayList<Integer> list = new ArrayList<>();
		//nums에 1부터 45까지의 난수를 6개 추가하시고
		//nums의 각 index에 어떤값이 있는데 출력
		Random r = new Random();
		for (int i=1;i<=6;i++) {
			list.add(r.nextInt(44)+1);
			
			
			System.out.print(list);
			System.out.println("nums["+"]=" + list.get(i));
			
		}
	}
}
