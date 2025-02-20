package p0206;

public class StringTest4 {
	public static void main(String[] args) {
		String str = "안녕하세요";
		int index = str.indexOf("세");

		System.out.println(index);
		index = str.indexOf("안");

		System.out.println(index);

		index = str.indexOf("안녕");
		System.out.println(index); //최솟값을 배출함 //0
		
		index = str.indexOf("하세요");
		System.out.println(index);
		
		index = str.indexOf("하세요.");
		System.out.println(index); //단어를 찾지 못하면 -1 배출
		
		System.out.println(str.replace("안", "an")); //String 값을 바꾸고 다시 되돌림
		
		str = str.replace("안", "an");
		str = str.replace("하", "ha");
		System.out.println(str);
		
		str = "안녕하세요.";
		System.out.println(str.substring(0,2)); //substring은 0-1 까지의 문자를 가져온다 //안녕 출력  //String 값을 바꾸고 다시 되롣림
		System.out.println(str.substring(2,2)); //빈문자 나옴 //값이 있다
		System.out.println(str);
		System.out.println(str);
		
		str = str.substring(0,2);
		str = str.substring(0,1);
		System.out.println(str);
		String str1 = null;
		String str2 = "";
		System.out.print(null == str1);
		System.out.print(null == str2);
		
	}
}
