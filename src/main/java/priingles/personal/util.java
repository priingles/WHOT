package priingles.personal;

public class util {
	priingles.personal.deck deck = new deck();
	public priingles.personal.deck deck_load(){
		card _1square = new card("1square", 1, "square"); deck.add(_1square);
		card _2square = new card("2square", 2, "square"); deck.add(_2square);
		card _3square = new card("3square", 3, "square"); deck.add(_3square);
		card _4square = new card("4square", 4, "square"); deck.add(_4square);
		card _5square = new card("5square", 5, "square"); deck.add(_5square);

		return deck;

	}

	public void set_up(){}
}
