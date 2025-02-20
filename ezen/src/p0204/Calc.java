package p0204;

public class Calc {
	int add(int n1,int n2) {
		return n1+n2;
	}
	int minus(int n1, int n2) {
		return n1-n2;
	}
	int multiple(int n1, int n2) {
		return n1*n2;
	}
	int division(int n1,int n2) {
		return n1/n2;
	}
	
	public static void main(String[]args) {
		Calc c = new Calc();
		int result = c.add(1,2);
		System.out.print(result);
		//minus, multiple, division
		
	}
}
