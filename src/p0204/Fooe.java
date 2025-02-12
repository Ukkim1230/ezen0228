package p0204;

public class Fooe extends Object { //자바의 데이터 타입은 오브젝트에서 상속됨.
	int price;
	String name;
	public String toString() {
		return "가격 : " + price +", 이름 : " + name;
	}
	public static void main(String[]args) {
		Fooe food = new Fooe();
		food.name =  "참치 김밥";
		food.price = 2000;
		String str = food.toString();
		System.out.println(str);
		System.out.println();
		//자바는 자바 버츄얼 머신에서 따로 작동된다.
		//toString은 jvm에 있는 메모리의 저장을 출력한다
	}
}
