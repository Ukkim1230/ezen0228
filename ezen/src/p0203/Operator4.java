package p0203;

public class Operator4 {
	public static void main(String[]args) {
		//증강연산자
		int i = 1;
		i++; //1을 더한다
		i--; //1을 뺀다
		
		System.out.println(i++);//1 , 후순위 연산자 출력후 더한다
		System.out.println(++i);//3 , 대입 연산자 더한후 출력
	
	}
}
