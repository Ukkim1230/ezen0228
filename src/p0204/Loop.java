package p0204;

public class Loop {
	public static void main(String[]args) {
	//총 9개의 for문을 사용하여 
	//구구단 1단부터 9단까지 출력해주세요
		/*
		 * 1X1=1
		 * 1X2=2
		 * ...
		 * ...
		 * 9X9=81
		 */
		for(int i=1;i<=9;i++) {
			System.out.println(1+"x"+i+"="+(i*1));
		}
		for(int i=2;i<=9;i++) {
			System.out.println(1+"x"+i+"="+(i*1));
		}
		for(int i=3;i<=9;i++) {
			System.out.println(1+"x"+i+"="+(i*1));
		}
		
		for(int i=4;i<=9;i++) {
			System.out.println(1+"x"+i+"="+(i*1));
		}
		for(int i=5;i<=9;i++) {
			System.out.println(1+"x"+i+"="+(i*1));
		}
		for(int i=6;i<=9;i++) {
			System.out.println(1+"x"+i+"="+(i*1));
		}
		for(int i=7;i<=9;i++) {
			System.out.println(1+"x"+i+"="+(i*1));
		}
		for(int i=8;i<=9;i++) {
			System.out.println(1+"x"+i+"="+(i*1));
		}
		for(int i=9;i<=9;i++) {
			System.out.println(1+"x"+i+"="+(i*1));
		}
		
		//다중 for문을 사용하여 구구단을 구연하였음
		
		for (int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.print(i+"x"+j+"="+(i*j)+",");
				if(j==9) {
					System.out.print(i+"x"+j+"="+(i*j));
				}
			}System.out.println("");
		}
	}
}
