package p0204;

public class Game {

	public int price;
	public String name;
	public String vendor;

	public String toString() {
		return "가격 : " + price + "이름 : " + name + "vendor : " + vendor;

	}

	public static void main(String[] args) {
		Game game = new Game();
		game.price = 14000;
		game.name = "삼국지";
		game.vendor = "koei";

		System.out.println(game);
		// price 14000, name 삼국지 ,vendor koei
		// 값을 가진 객체를 생성하고
		// System.out.println(객체)를 출력했을때
		// 메모리 주소가 아니라 각 값을 출력하는 코드를 완성해주세요.
	}
}
