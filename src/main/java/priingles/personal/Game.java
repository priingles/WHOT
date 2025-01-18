package priingles.personal;

import java.util.LinkedList;

public class Game {
    private LinkedList<Player> players; // List of players in the game.
    private Deck marketDeck; // Deck used for drawing cards during the game.
    private Card topCard; // The card currently on top of the play pile.
    private int currentPlayerIndex; // Tracks the index of the player whose turn it is.
    private boolean playingCondition = true;

    public Game() {
        players = new LinkedList<>();
        marketDeck = new Deck();
        marketDeck.loadFull(); // Load cards into the deck.
        marketDeck.shuffle(); // Shuffle the deck for randomness.
        currentPlayerIndex = 0; // Start with the first player.
    }

    public void addPlayer(Player player) {
        players.add(player); // Add a player to the game.
    }

    public void startGame() {
        // Deal initial cards to players.
        for (Player p : players) {
            for (int i = 0; i < 5; i++) { // Each player gets 5 cards.
                p.deck.add(marketDeck.getCard());
            }
        }
        // Set the first card on the play pile.
        topCard = marketDeck.getCard();
        System.out.println("Game started! First card: " + topCard.name);
        gameLoop(); // Begin the game loop.
    }

    private void gameLoop() {
        while (playingCondition) {
            Player currentPlayer = players.get(currentPlayerIndex); // Get the current player.
            System.out.println("It's " + currentPlayer.getName() + "'s turn.");
            playTurn(currentPlayer); // Process the current player's turn.
            if (currentPlayer.hasWon()) { // Check for a win condition.
                System.out.println(currentPlayer.getName() + " has won the game!");
                playingCondition = false; // End the game if a player wins.
            }
            // Move to the next player in a circular manner.
            currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        }
    }

    private void playTurn(Player currentPlayer) {
        // Attempt to find a valid card to play.
        Card playedCard = null;
        for (Card c : currentPlayer.deck.getDeck()) {
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
            if (marketDeck.status()){
                currentPlayer.deck.add(marketDeck.getCard());
            }
            else{
                emptyDeck();
                playingCondition = false;
            }

        }
    }

    private boolean isValidMove(Card cardToPlay) {
        // Check if the card matches the top card’s number or shape.
        return cardToPlay.number == topCard.number || cardToPlay.shape.equals(topCard.shape);
    }

    private void applyCardEffect(Card playedCard) {
        // Handle special card effects (e.g., pick 2, general market).
        if ("pick_2".equals(playedCard.power_up)) {
            // The next player must draw 2 cards.
            Player nextPlayer = players.get((currentPlayerIndex + 1) % players.size());
            System.out.println(nextPlayer.getName() + " must pick 2 cards!");
            for (int i = 0; i < 2; i++) {
                if (marketDeck.status()) {
                    nextPlayer.deck.add(marketDeck.getCard());
                }
                else {
                    emptyDeck();
                    playingCondition = false;
                }

            }
        } else if ("GENERAL MARKET!".equals(playedCard.power_up)) {
            // All players must draw 1 card.
            System.out.println("All players must draw 1 card!");
            for (Player p : players) {
                if (marketDeck.status()) {
                p.deck.add(marketDeck.getCard());
                }
                else {
                    emptyDeck();
                    playingCondition = false;
                }

            }
        }
        // Additional effects can be added here as needed.
    }

    private void emptyDeck(){

        LinkedList<Player> winningPlayer = new LinkedList<>();
        Player placeholder = new Player("placeholder");
        placeholder.point = 60000;
        winningPlayer.push(placeholder);

        for (Player p : players){
            for(Card c : p.deck.getDeck()){
                p.point += c.number;
            }
        }

        for (Player p : players){
            if(p.point < winningPlayer.peek().point){
                winningPlayer.push(p);
            }
        }

        System.out.println(winningPlayer.peek().getName() + " has least number of cards");
        System.out.println(winningPlayer.peek().getName() + " has won the game!");

    }
}
