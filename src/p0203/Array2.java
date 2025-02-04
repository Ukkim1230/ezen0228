package p0203;

public class Array2 {
	public static void main(String[]args) {
		char c1 ='안';
		char c2 ='녕';
		char c3 ='세';
		char c4 ='하';
		char c5 ='요';
		char c6 ='.';
		
		char[] hel = new char[] {'안','녕','하','세','요','.'};
		for(int i=hel.length-1;i>=0;i--) {
			System.out.print(hel[i]);
			// hel.lenght 값은 6 hel 배열의 마지막 index는 5라서 -1 을 붙였다
			//String은 char의 배열이다
		}
		
		
	}
}
