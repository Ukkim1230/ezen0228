package p0212;

public class Human {
	private String name;
	private int age;
	private String address;
	private double weight;

	/*
	 * 모든 멤버변수는 private 으로 선언한다. 대신 값을 셋팅하고 겟할 수 있는 public get set 메소드를 만든다
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setWeight(double Weight) {
		this.weight=Weight;
	}
	public double getWeight() {
		return weight;
	}
	public String toString() {
		return "[name="+name+",age="+age+",address="+address+",weight="+weight+"]"; 
	}
}

class Execute {
	public static void main(String[] args) {
		Human h = new Human();
		h.setName("홍길동");
		h.setAge(30);
		h.setAddress("서울");
		h.setWeight(70.5);
		System.out.print(h);
		
	}
}