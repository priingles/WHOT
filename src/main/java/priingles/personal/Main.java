package priingles.personal;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		Deck market_deck = new Deck();
		Game game = new Game();
		market_deck.load();
		market_deck.shuffle();
	}
}