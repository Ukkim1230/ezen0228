package p0205;

public class MethodTest5 {
	int money() {
		return 1;
	}

	static int money = 100;

	static void saveMoney(int money) {
		MethodTest5.money += money;
	}
	
		int num=1000;
		void addNum(int num) {
			this.num += num;
		}
			
	

	public static void main(String[] args) {
		MethodTest5 mt = new MethodTest5();
		saveMoney(10);
		System.out.print(MethodTest5.money);
		mt.addNum(10);
		System.out.println(mt.num);
		
	}
}
