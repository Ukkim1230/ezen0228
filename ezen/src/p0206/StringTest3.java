
package p0206;

public class StringTest3 {
	
	
	
	public static void main(String[]args) {
		int i = 1;
		System.out.println(i==1);
		double b1 = 1;
		System.out.println(b1==1);//1= 1.0으로 치환
		System.out.println(b1);//1.0 
		
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		
		System.out.println(str1); //안녕
		System.out.println(str2); //안녕
		System.out.println(str1 == str2); //String 값이 아니라 메모리 주소 비교하여 false가 나온다
		System.out.println(str1.equals(str2));
		
		String str3 = "안녕";
		String str4 = "안녕";
		System.out.println(str3 == str4);
	}
}
