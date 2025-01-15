package priingles.personal;

import java.util.LinkedList;

public class deck {

	LinkedList<card> cards;

	public void add(card card){
		cards.add(card);
	}

	public card get_card(){
		return cards.pop();
	}
}
