package priingles.personal;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		deck market_deck = new deck();
		market_deck.load();
		market_deck.shuffle();
		for ( card element : market_deck.get_deck()) {
			System.out.println(element.name);
		}
	}
}