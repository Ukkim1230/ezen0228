package p0203;

import java.util.Random;

public class RandomTest {
	public static void main(String[]args) {
		//난수 정해진 숫자외의 다른 숫자가 나옴 
		Random r = new Random();
		int rNum = r.nextInt(100); //0-99
		
		double db = Math.random(); //0.0--99.999999...
		
		rNum = (int)db; //0-99
		
	}
}
