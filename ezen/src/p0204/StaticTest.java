package p0204;

public class StaticTest {
	int nums;
	String str;
	static int num2;
	public static void main(String[]args) {
		System.out.println(num2);
		StaticTest st = new StaticTest();
		System.out.println(st.nums);
		st.nums = 10;
		System.out.println(st.nums);
		
		
		
		
		
		
	}
}
