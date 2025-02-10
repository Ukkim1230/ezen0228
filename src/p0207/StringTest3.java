package p0207;

import java.util.ArrayList;

public class StringTest3 {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		for(int i=0;i<100;i++) {
			list.add(i+"");
			
		}
		
		//3이 있는 스트링은 짝으로 출력
		for(int i=0;i<list.size();i++) {
			String str=list.get(i);
				str = str.replace("3", "짝");
				System.out.print(str);
			}
		}
	}
//str = 1.replace("3","짝") / 13 == 1짝 23 == 2짝 
