package p0207;

import java.util.ArrayList;

public class StringTest2 {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		for(int i=0;i<100;i++) {
			list.add(i+"");
			
		}
		
		//3이 있는 스트링은 짝으로 출력
		for(int i=0;i<list.size();i++) {
			String str=list.get(i);
			if (str.indexOf("3")!=-1) {
				System.out.print("짝");
			}else {
				System.out.print(str);
			}
		}
	}

}
