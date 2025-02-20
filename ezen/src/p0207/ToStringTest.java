package p0207;
class Father {
	public static String test(){
		return "1";
	}
}






public class ToStringTest extends Father{
	static String test() {
		return"";
	}
	static String toString1() {
		return"";
	}
	//오버라이딩의 조건 
	//변수 명이 같이야 된다, static와 unstatic의 같아야 된다, 매개변수가 같아야 된다,데이터 함수가 같아야 한다.
	
	public static void main(String[]args) {
		//integer.toString[];
		//Object.toString[]; 의 toString은 static
		//두 toString은 서로 다르다.
	}
	
	
}
