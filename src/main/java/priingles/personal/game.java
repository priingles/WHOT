package priingles.personal;

import java.util.LinkedList;

public class game {
    private LinkedList<player> players; // List of players in the game.
    private deck marketDeck; // Deck used for drawing cards during the game.
    private card topCard; // The card currently on top of the play pile.
    private int currentPlayerIndex; // Tracks the index of the player whose turn it is.

    public game() {
        players = new LinkedList<>();
        marketDeck = new deck();
        marketDeck.load(); // Load cards into the deck.
        marketDeck.shuffle(); // Shuffle the deck for randomness.
        currentPlayerIndex = 0; // Start with the first player.
    }

    public void addPlayer(player player) {
        players.add(player); // Add a player to the game.
    }

    public void startGame() {
        // Deal initial cards to players.
        for (player p : players) {
            for (int i = 0; i < 5; i++) { // Each player gets 5 cards.
                p.drawCard(marketDeck);
            }
        }
        // Set the first card on the play pile.
        topCard = marketDeck.get_card();
        System.out.println("Game started! First card: " + topCard.name);
        gameLoop(); // Begin the game loop.
    }

    private void gameLoop() {
        while (true) {
            player currentPlayer = players.get(currentPlayerIndex); // Get the current player.
            System.out.println("It's " + currentPlayer.getName() + "'s turn.");
            playTurn(currentPlayer); // Process the current player's turn.
            if (currentPlayer.hasWon()) { // Check for a win condition.
                System.out.println(currentPlayer.getName() + " has won the game!");
                break; // End the game if a player wins.
            }
            // Move to the next player in a circular manner.
            currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        }
    }

    private void playTurn(player currentPlayer) {
        // Attempt to find a valid card to play.
        card playedCard = null;
        for (card c : currentPlayer.getHand()) {
            if (isValidMove(c)) { // Check if the card is a valid move.
                playedCard = c;
                currentPlayer.playCard(c); // Play the card.
                break;
            }
        }
        if (playedCard != null) {
            System.out.println(currentPlayer.getName() + " played: " + playedCard.name);
            topCard = playedCard; // Update the top card on the pile.
            applyCardEffect(playedCard); // Handle any special effects of the card.
        } else {
            // If no valid cards, draw one from the deck.
            System.out.println(currentPlayer.getName() + " has no valid cards. Drawing a card...");
            currentPlayer.drawCard(marketDeck);
        }
    }

    private boolean isValidMove(card cardToPlay) {
        // Check if the card matches the top card’s number or shape.
        return cardToPlay.number == topCard.number || cardToPlay.shape.equals(topCard.shape);
    }

    private void applyCardEffect(card playedCard) {
        // Handle special card effects (e.g., pick 2, general market).
        if ("pick_2".equals(playedCard.power_up)) {
            // The next player must draw 2 cards.
            player nextPlayer = players.get((currentPlayerIndex + 1) % players.size());
            System.out.println(nextPlayer.getName() + " must pick 2 cards!");
            for (int i = 0; i < 2; i++) {
                nextPlayer.drawCard(marketDeck);
            }
        } else if ("GENERAL MARKET!".equals(playedCard.power_up)) {
            // All players must draw 1 card.
            System.out.println("All players must draw 1 card!");
            for (player p : players) {
                p.drawCard(marketDeck);
            }
        }
        // Additional effects can be added here as needed.
    }
}
