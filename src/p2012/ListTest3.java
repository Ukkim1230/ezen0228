package p2012;

import java.util.ArrayList;

public class ListTest3 {
	/*
	 * 5개 게임 만들기 1.name 삼국지 2. price 30000 3. genre 전략 1.name 롤 2. price 0 3. genre
	 * 실시간전략 1.name 카트라이더 2. price 0 3. genre 스포츠 1.name 스타크래프트 2. price 15000 3.
	 * genre 실시간 전략 1.name 오버워치 2. price 30000 3. genre 슈팅
	 */

	public static void main(String[] args) {
		Game game1 = new Game();
		game1.setName("삼국지");
		game1.setPrice(30000);
		game1.setGenre("전략");
		Game game2 = new Game();
		game2.setName("롤");
		game2.setPrice(0);
		game2.setGenre("실시간 전략");
		Game game3 = new Game();
		game3.setName("카트라이더");
		game3.setPrice(0);
		game3.setGenre("스포츠");
		Game game4 = new Game();
		game4.setName("스타크래프트");
		game4.setPrice(15000);
		game4.setGenre("실시간 전략");
		Game game5 = new Game();
		game5.setName("오버워치");
		game5.setPrice(30000);
		game5.setGenre("슈팅");
		ArrayList<Game> gameList = new ArrayList<>();

		gameList.add(game1);
		gameList.add(game2);
		gameList.add(game3);
		gameList.add(game4);
		gameList.add(game5);
		for (Game game : gameList) {
			// 장르에 "전략"이라는 단어가 들어간 게임만 출력해 주세요
			// price가 0이 아닌것
			String genre = game.getGenre();
			int price = game.getPrice();
			if (genre.indexOf("전략") != -1 && price != 0) {
				System.out.print(game);
			}

		}
		for (Game game : gameList) {
			int price = game.getPrice();
			// price가 15000이상 30000원 미만인 것만 통계
			if (price >= 15000 && price < 30000) {
				System.out.print(game);
			}
		}

	}

}
