package p0204;

public class Computer {
	public String cpu;
	public String ram;
	public String ssd;
	public int price;

	public	String toString() {
		return "Computer [cpu : " + cpu + "ram : "+ ram +"ssd : " + ssd + "price : " + price+"]" ;   
		}

	public static void main(String[] args) {
		Computer computer = new Computer();

		// cpu i7-13 ram 16gb ssd 25 price 1100000;
		// 위의 값으로 객체를 만들고 출력했을때 각 값이 나오는 코드를 완성해주세요
		computer.cpu = "i7-13";
		computer.ram = "16GB";
		computer.ssd = "2T";
		computer.price = 1100000;
		System.out.print(computer);

	}
}
