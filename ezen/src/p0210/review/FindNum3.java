package p0210.review;

import java.util.ArrayList;

public class FindNum3 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(10);
		numbers.add(30);
		numbers.add(16);
		numbers.add(7);
		numbers.add(11);
		numbers.add(42);

		int min = 0;
		for (int i = 0; i < numbers.size(); i++) {
			if(min==0) {
				min = numbers.get(i);
				
			}else if (min>numbers.get(i)); {
				min = numbers.get(i);
			}
		}
		System.out.print("최솟값은"+ min);
		
	}
}
