package priingles.personal;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		deck market_deck = new deck();
		Game game = new Game();
		market_deck.load();
		market_deck.shuffle();
		game(market_deck);
	}
}