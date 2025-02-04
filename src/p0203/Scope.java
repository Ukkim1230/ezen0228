package p0203;

public class Scope {
	public static void main(String[]args) {
		int i = 1;
		if(i==1){
		 System.out.println("i는 1이다");
		
		}
	}//i는 10라인에서 죽음
	void test() {
		int i= 1;//i가 10라인에서 죽어서 12라인에서 동일한 이름의 변수 선언 가능함
	}
}
