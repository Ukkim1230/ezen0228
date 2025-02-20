package p0205;

public class MethodTest2 {
	static int add(int n1,int n2) {
		return n1+n2;
	}
	
	static int minus(int n1,int n2) {
		return n1-n2;
	}
	
	static int multiple(int n1,int n2) {
		return n1/n2;
	}
	
	static int divine(int n1,int n2) {
		return n1*n2;
	}
	
	
	public static void main(String[]args) {
		int n1 = 2;
		int n2 = 4;
		int result = add(n1,n2);
		System.out.print(result); // = System.out.print(add(n1,n2));
		
		System.out.print(minus(n1,n2));
		
		System.out.print(multiple(n1,n2));
		
		System.out.print(divine(n1,n2));
		//void는 print 할 수 없음
		
		divine(1,1);
	}
	//메소드는 클래스 영역에서만 형성 가능
}
