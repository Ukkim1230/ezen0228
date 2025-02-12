package p0210.review;

import java.util.ArrayList;
import java.util.Random;

public class FindNum2 {
	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Integer> numbers = new ArrayList<>();
		while (numbers.size() < 10) {
			int randomNumber = random.nextInt(50) + 1;
			if (numbers.indexOf(numbers) == -1) {
				numbers.add(randomNumber);
			}
		}
		System.out.print(numbers);
		for (int i = 1; i <= 50; i++) {
			if (numbers.indexOf(i) != -1) {
				System.out.print("numbers의 가장 작은 수는" + i + "이다");
				break;
			}

		}

	}
}
