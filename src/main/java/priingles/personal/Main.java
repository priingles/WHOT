package priingles.personal;

public class Main {
	public static void main(String[] args) {
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");

		Rules rules = new Rules();
		rules.trad = true;
		rules.gm = true;
		rules.hold_on = true;
		rules.pick_2 = true;
		rules.suspension = true;
		rules.pick_3= true;
		rules.WHOT = true;




		Game game = new Game(rules);
		game.addPlayer(player1);
		game.addPlayer(player2);
		game.startGame();
	}
}