package p0205;

public class Contructor {
	public Contructor() {
		System.out.print("1");
		System.out.print("1");
		System.out.print("1");
		System.out.print("1");
		System.out.print("1");		
	};

	// 메모리 생성될때 자동으로 생성되는 코드
	// 생성자는 데이터 함수를 넣을 수 없다
	public Contructor(int i) {
		System.out.print("2");
	} //생성자도 오버로딩 적용됨
	public static void main(String[] args) {
		Contructor c = new Contructor();
		System.out.print(c); //생성자 전부 실행후 c 실행함
	
		
	}
}
