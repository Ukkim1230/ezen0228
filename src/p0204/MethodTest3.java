package p0204;

public class MethodTest3 {
	int money = 1000;
	
	void saveMoney(int money) {
		this.money += money; //멤버변수 money를 뜻한다
		
	}
	
	
	public static void main(String[]args) {
		MethodTest3 mt = new MethodTest3();
		mt.saveMoney(1000); //this == mt
		System.out.println(mt.money); //2000
		
		MethodTest3 mt1 = new MethodTest3();
		mt.saveMoney(2000); //this == mt1
		System.out.println(mt.money); //3000
	}
}
