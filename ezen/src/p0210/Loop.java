package p0210;

public class Loop {
	// 1단부터 2단까지 출력하는 2중for문을 완성
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for(int j=1;j<=9;j++) {
				if(j==9) {
					System.out.print(i+"+"+j+"="+(i*j));
					System.out.println("");
				}else {
					System.out.print(i+"+"+j+"="+(i*j)+",");
				}
			}
		}
	}
}
