package p0203;

public class ExitTest {
	public static void main(String[]args) {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			if(i==5) {
				//break; ,for문에서 나감 ,반복문에서만 사용가능
				//return; ,main 메소드에서 나감 ,메소드 안 이면 어디서든지 사용가능
				//System.exit(0); ,프로그랩을 종료
			}
		}
		System.out.println("반복문이 종료되었습니다.");
	}
}
