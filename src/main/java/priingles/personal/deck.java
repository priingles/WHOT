package priingles.personal;

import java.util.Collections;
import java.util.LinkedList;

public class deck {

	LinkedList<card> cards = new LinkedList<>();


	public void add(card card){
		cards.add(card);
	}
	public LinkedList load(){
		card _1square = new card("1square", 1, "square", "hold_on"); cards.add(_1square);
		card _2square = new card("2square", 2, "square", "pick_2"); cards.add(_2square);
		card _3square = new card("3square", 3, "square", null); cards.add(_3square);
		card _5square = new card("5square", 5, "square", "pick_3"); cards.add(_5square);

		return cards;

	}



	public card get_card(){
		return cards.pop();
	}
	public LinkedList<card> get_deck(){
		return cards;
	}

	public void shuffle(){
		Collections.shuffle(cards);
	}

}
