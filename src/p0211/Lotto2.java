package p0211;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lotto2 {
	
	public static void main(String[]args) {
		ArrayList<Integer> nums = new ArrayList<>();
		Scanner scan = new Scanner(System.in);		
		Random random = new Random();
		System.out.print("로또 번호를 ,를 기준으로 입력");
		String yourNumbers = scan.nextLine();
		
		System.out.print("니가 입력한 로또번호 : "+ yourNumbers);
		String[] yourNumArray = yourNumbers.split(",");
		
		
		while(nums.size()<6) {
			int rNum  = random.nextInt(45)+1;
			if(nums.indexOf(rNum)==-1) {
				nums.add(rNum);
			}
		}
		int count = 0;
		for (int i=0;i<nums.size();i++) {
			String str = yourNumArray[i];
			int yourNum = Integer.parseInt(str);
				for(int j=0;j<nums.size();j++) {
					if(nums.indexOf(yourNum)!=-1) {
						count++;
					}
				}
		}
		if (count==6) {
			System.out.print("1등입니다");	
		}else if (count==5) {
			System.out.print("2등입니다");
		}else if (count==4) {
			System.out.print("3등입니다");
		}else {
			System.out.print("쪽박되셨습니다");
		}
		
		
		
	}
}
