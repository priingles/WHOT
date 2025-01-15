package priingles.personal;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class deck {
	priingles.personal.deck deck = new deck();
	LinkedList<card> cards;
	public priingles.personal.deck load(){

		//SQUARES

		card _1square = new card("1square", 1, "square", "hold_on"); deck.add(_1square);
		card _2square = new card("2square", 2, "square", "pick_2"); deck.add(_2square);
		card _3square = new card("3square", 3, "square", null); deck.add(_3square);
		card _5square = new card("5square", 5, "square", "pick_3"); deck.add(_5square);
		card _7square = new card("7square", 7, "square", null); deck.add(_7square);
		card _10square = new card("10square", 10, "square", null); deck.add(_10square);
		card _11square = new card("11square", 11, "square", null); deck.add(_11square);
		card _13square = new card("13square", 13, "square", null); deck.add(_13square);
		card _14square = new card("14square", 14, "square" ,"gm"); deck.add(_14square);

		//CIRCLES

        card _1circle = new card("1circle", 1,"circle", "hold_on"); deck.add(_1circle);
		card _2circle = new card("2circle", 1, "circle", "pick_2"); deck.add(_2circle);
		card _3circle = new card("3circle", 3,"circle", null); deck.add(_3circle);
		card _4circle = new card("4circle", 4, "circle", null); deck.add(_4circle);
		card _5circle = new card("5circle", 5, "circle", null); deck.add(_5circle);
		card _6circle = new card("6circle", 5, "circle", null); deck.add(_6circle);


		return deck;

	}
	public void add(card card){
		cards.add(card);
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
