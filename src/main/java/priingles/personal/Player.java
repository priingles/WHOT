package priingles.personal;import java.util.LinkedList;/** * Represents a player in the WHOT game. */
public class Player {
	private String name; // Player's name.
	public Deck deck;
	private LinkedList<Card> hand; // Cards in the player's hand.
	public int point;

	public Player(String name) {
		this.name = name;
//		this.hand = new LinkedList<>();
		this.point = 0;
		this.deck = new Deck();
	}

	public String getName() {
		return name;
	}

	public LinkedList<Card> getHand() {
		return hand;
	}

//	public void addCard(Card card) {
//		hand.add(card);
//	}

	public void drawCard(Deck marketDeck) {
		Card drawnCard = marketDeck.getCard();
		if (drawnCard != null) {
			deck.getDeck().add(drawnCard);// Add a card from the deck to the hand.
		}
		else{}

		}

	public void playCard(Card cardToPlay) {
		deck.getDeck().remove(cardToPlay); // Remove a card from the hand.       // TODO: Handle card effects.
		}

	public boolean hasWon() {
		return deck.getDeck().isEmpty(); // Check if the player has no cards left.
		}
}