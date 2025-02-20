package p0207;

import java.util.Random;

public class Array2 {
	public static void main(String[]args) {
		
		int nums[] = new int[10];
		int randomNums[] = new int [10];
		
		Random r = new Random();
		//1부터 100까지의 난수를 nums에 대입하는데 
		//짝수일 경우에만 대입해주세요.
		//짝수이면서 3의 배수이거나 5의 배수 일대만 대입
		for (int i = 0; i<nums.length;i++) {
			randomNums[i] = r.nextInt(99)+1;
			
			if(randomNums[i]%2==0 && (randomNums[i]%5==0||randomNums[i]%3==0)) {
				nums[i] = randomNums[i];
			}else {
				i--;
			}
		}
		Array.PrintArray(randomNums);
	}
}
