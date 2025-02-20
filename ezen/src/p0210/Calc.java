package p0210;

public class Calc {
	//리턴 하지 않으면서 메모리 생성을 안 하고 싶을떄
	static void printAdd(int n1, int n2) {
		System.out.print(n1+n2);
	}
	//리턴하면서 메모리 생성을 안하고 싶을떄
	static int add(int n1 , int n2) {
		return n1+n2;
	}
	static void printMinus(int n1,int n2) {
		System.out.print(n1 - n2);
	}
	static int minus (int n1,int n2) {
		return n1 - n2;
	}
	static void PrintMulti(int n1,int n2) {
		System.out.print(n1*n2);
	}
	static int multi(int n1,int n2) {
		return n1*n2;
	}
	static void printDivisions(int n1,int n2) {
		System.out.print(n1/n2);
	}
	static int division(int n1,int n2) {
		return n1/n2;
	}
	static void printMod (int n1,int n2) {
		System.out.print(n1&n2);
	}
	static int mod(int n1,int n2) {
		return n1*n2;
	}
	
	public static void main(String[]args) {
		int n1=1;
		int n2=2;
		int result = add(n1,n2);
		System.out.print(result);
		result = minus(n1,n2);
		System.out.print(result);
		result = multi(n1,n2);
		System.out.print(result);
		result = division(n1,n2);
		System.out.print(result);
		result = mod(n1,n2);
		System.out.print(result);
		//System.out.println(n1+n2);
		//빼기 (printMinus,minus),(printMulti,multi),(printDivisions,divisin),(printMod,mod)
		printAdd(n1,n2);
		printMinus(n1,n2);
		PrintMulti(n1,n2);
		printDivisions(n1,n2);
		printMod (n1,n2);
	}
}
