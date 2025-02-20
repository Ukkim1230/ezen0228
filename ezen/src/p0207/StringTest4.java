package p0207;

import java.util.ArrayList;

public class StringTest4 {
	public static void main(String[]args) {
		/*list 1부터 100까지의 값을 순서대로 추가
		 * 반복문으 사용해서 찰{대로 추가
		 * 단 3이나 6이나 9가 있는 스트릴을 짝으로 출력해주세요
		 */
		ArrayList<String> list = new ArrayList<>();
		for (int i =1; i<=100;i++) {
			list.add(i+"");
			
			
			
		}
		for (int i =0; i<list.size();i++) {
			String str = list.get(i);
			str = str.replace("3", "짝");
			str = str.replace("6", "짝");
			System.out.print(str+",");
			
		}

	}
}
