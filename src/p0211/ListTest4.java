package p0211;

import java.util.ArrayList;
import java.util.Random;

public class ListTest4 {
	public static void main(String[]args) {
		ArrayList<String> stringArray = new ArrayList<>();
		Random random = new Random();
		//난수 1-45까지의 난수를 생성하여 strs에 사이즈가 6이 될때까지 추가
		while(stringArray.size()<6) {
			int randomNums = random.nextInt(45)+1;
			String randomNumsStr = Integer.toString(randomNums);
			if(stringArray.indexOf(randomNums)==-1) {
				stringArray.add(randomNumsStr);
			}
			
		}
		
		
		
	}
}
