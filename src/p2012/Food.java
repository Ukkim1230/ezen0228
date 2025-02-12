package p2012;

public class Food {
	/*
	 * String 이름(name), int 가격(price), String 분류(type)
	 * 해당 변수를 private 으로 선언하고
	 * public 올 getter, setter 메서드를 생성
	 * toString을 오버라이딩하여 각 값이 나오는 클래스를 생성
	 */
	String name;
	int price;
	String type;
	private void setName(String name) {
		this.name = name;
	}
	private String getName() {
		return name;
	}
	private void setPrice(int price) {
		this.price = price;
	}
	private int getPrice() {
		return price;
	}
	private void setString(String type) {
		this.type = type;
	}
	private String getString() {
		return type;
	}
}
