package p0206;

class Mother{
	void work() {
		System.out.println("어머님이 일하신다.");
		
	}
	
}


public class OverRiding1 extends Mother{
	void work() {
		System.out.print("내가 일한다");
	}
	/*홍길동은 사람으로 부를 수 있다.
	 * 즉 사람 s = new 홍길동()이 가능하지만
	 * 사람은 홍길동이라고 부를 수 없다
	 * 즉 홍길동 h = 사람은()은 불가능하다
	 */
		public static void main(String[]args) {
			 OverRiding1 o = new OverRiding1();
			//OverRiding1 o2 = new Mother(); 안됨
			 String str = o.toString();
			 o.work(); //OverRiding1의 work 실행
			 Mother m = new OverRiding1();
			 m.work(); //OverRiding1의 work 실행
			 
		}
}
