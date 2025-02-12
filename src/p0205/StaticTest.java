package p0205;

public class StaticTest {
	int i =1;
	static int i3 =3;
	public static void main(String[]args) {
		
		
		StaticTest st; // 선언만 함
		StaticTest st1 = new StaticTest(); //선언 및 초기화를 함
		System.out.println(st1.i);
		System.out.print(i3); //i3앞에 StaticTest 생략됨 , static 써서
		int i;
		
	}
}
