package p0207;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "안녕";
		String str2 = "안녕";
		System.out.print(str1 == str2);// true
		String str3 = new String("안녕");
		System.out.println(str1 == str3);// false
		System.out.println(str1.equals(str3));
		System.out.print(str3.equals("안녕"));
		String str4 = new String("안녕");
		
		str4 = null;
		
		System.out.print(str4.equals(str3)); // 오류남 null은 아예 없다는 것이기 때문에 비교가 불가능
		
		System.out.print(str4 != null && str3.equals(str4));
		System.out.print("안녕".equals(str4)); //비교하는 값을 앞에 쓰면 에러 안남 
	}
}
