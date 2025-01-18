package priingles.personal;

public class Main {
	public static void main(String[] args) {
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");

		Game game = new Game();
		game.addPlayer(player1);
		game.addPlayer(player2);
		game.startGame();
	}
}