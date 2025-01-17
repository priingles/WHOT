package priingles.personal;

import java.util.LinkedList;

/**
 * Represents a player in the WHOT game.
 */
public class player {
	private String name; // Player's name.
	private LinkedList<card> hand; // Cards in the player's hand.

	public player(String name) {
		this.name = name;
		this.hand = new LinkedList<>();
	}

	public String getName() {
		return name;
	}

	public LinkedList<card> getHand() {
		return hand;
	}

	public void drawCard(deck marketDeck) {
		hand.add(marketDeck.get_card()); // Add a card from the deck to the hand.
	}

	public void playCard(card cardToPlay) {
		hand.remove(cardToPlay); // Remove a card from the hand.
		// TODO: Handle card effects.
	}

	public boolean hasWon() {
		return hand.isEmpty(); // Check if the player has no cards left.
	}
}
