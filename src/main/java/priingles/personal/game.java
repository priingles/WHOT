package priingles.personal;

import java.util.LinkedList;

/**
 * Represents the WHOT game.
 */
public class game {
    private LinkedList<player> players; // List of players in the game.
    private deck marketDeck; // Central deck of cards.

    public game() {
        players = new LinkedList<>(); // Initialize player list.
        marketDeck = new deck(); // Create and load the deck.
        marketDeck.load();
        marketDeck.shuffle();
    }

    public void addPlayer(player player) {
        players.add(player); // Add a player to the game.
    }

    public void startGame() {
        // TODO: Deal cards and start the game.
    }

    public void playTurn(player player) {
        // TODO: Define the actions for a player's turn.
    }
}
