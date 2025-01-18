package priingles.personal;

import java.util.Collections;
import java.util.LinkedList;

public class Deck {
	LinkedList<card> cards = new LinkedList<>();
	public LinkedList<card> load(){

		//SQUARES
		card _1square = new card("1square", 1, "square", "hold_on"); cards.add(_1square);
		card _2square = new card("2square", 2, "square", "pick_2"); cards.add(_2square);
		card _3square = new card("3square", 3, "square", null); cards.add(_3square);
		card _4square = new card("4square", 4, "square",  null); cards.add(_4square);
		card _5square = new card("5square", 5, "square", "pick_3"); cards.add(_5square);
		card _6square = new card("6square", 6, "square", null); cards.add(_6square);
		card _7square = new card("7square", 7, "square", null); cards.add(_7square);
		card _8square = new card("8square", 8,"square", "suspension"); cards.add(_8square);
		card _9square = new card("9square", 9,"square", null); cards.add(_9square);
		card _10square = new card("10square", 10, "square", null); cards.add(_10square);
		card _11square = new card("11square", 11, "square", null); cards.add(_11square);
		card _12square = new card("12square", 12, "square", null); cards.add(_12square);
		card _13square = new card("13square", 13, "square", null); cards.add(_13square);
		card _14square = new card("14square", 14, "square" ,"GENERAL MARKET!"); cards.add(_14square);

		//CIRCLES
		card _1circle = new card("1circle", 1,"circle", "hold_on"); cards.add(_1circle);
		card _2circle = new card("2circle", 1, "circle", "pick_2"); cards.add(_2circle);
		card _3circle = new card("3circle", 3,"circle", null); cards.add(_3circle);
		card _4circle = new card("4circle", 4, "circle", null); cards.add(_4circle);
		card _5circle = new card("5circle", 5, "circle", null); cards.add(_5circle);
		card _6circle = new card("6circle", 5, "circle", null); cards.add(_6circle);
		card _7circle = new card("7circle",7,"circle",null); cards.add(_7circle);
		card _8circle = new card("8circle", 8, "circle", "suspension"); cards.add(_8circle);
		card _9circle = new card("9circle", 1,"circle", null); cards.add(_9circle);
		card _10circle = new card("10circle", 1, "circle", null); cards.add(_10circle);
		card _11circle = new card("11circle", 11,"circle", null); cards.add(_11circle);
		card _12circle = new card("12circle", 12, "circle", null); cards.add(_12circle);
		card _13circle = new card("13circle", 13, "circle", null); cards.add(_13circle);
		card _14circle = new card("14circle", 14,"circle", "GENERAL MARKET!"); cards.add(_14circle);

		//CROSS
		card _1cross = new card("1cross", 1,"cross", "hold_on"); cards.add(_1cross);
		card _2cross = new card("2cross", 1, "cross", "pick_2"); cards.add(_2cross);
		card _3cross = new card("3cross", 3,"cross", null); cards.add(_3cross);
		card _4cross = new card("4cross", 4, "cross", null); cards.add(_4cross);
		card _5cross = new card("5cross", 5, "cross", null); cards.add(_5cross);
		card _6cross = new card("6cross", 5, "cross", null); cards.add(_6cross);
		card _7cross = new card("7cross",7,"cross",null); cards.add(_7cross);
		card _8cross = new card("8cross", 8, "cross", "suspension"); cards.add(_8cross);
		card _9cross = new card("9cross", 1,"cross", null); cards.add(_9cross);
		card _10cross = new card("10cross", 1, "cross", null); cards.add(_10cross);
		card _11cross = new card("11cross", 11,"cross", null); cards.add(_11cross);
		card _12cross = new card("12cross", 12, "cross", null); cards.add(_12cross);
		card _13cross = new card("13cross", 13, "cross", null); cards.add(_13cross);
		card _14cross = new card("14cross", 14,"cross", "GENERAL MARKET!"); cards.add(_14cross);

		//Triangle
		card _1triangle = new card("1triangle", 1,"triangle", "hold_on"); cards.add(_1triangle);
		card _2triangle = new card("2triangle", 1, "triangle", "pick_2"); cards.add(_2triangle);
		card _3triangle = new card("3triangle", 3,"triangle", null); cards.add(_3triangle);
		card _4triangle = new card("4triangle", 4, "triangle", null); cards.add(_4triangle);
		card _5triangle = new card("5triangle", 5, "triangle", null); cards.add(_5triangle);
		card _6triangle = new card("6triangle", 5, "triangle", null); cards.add(_6triangle);
		card _7triangle = new card("7triangle",7,"triangle",null); cards.add(_7triangle);
		card _8triangle = new card("8triangle", 8, "triangle", "suspension"); cards.add(_8triangle);
		card _9triangle = new card("9triangle", 1,"triangle", null); cards.add(_9triangle);
		card _10triangle = new card("10triangle", 1, "triangle", null); cards.add(_10triangle);
		card _11triangle = new card("11triangle", 11,"triangle", null); cards.add(_11triangle);
		card _12triangle = new card("12triangle", 12, "triangle", null); cards.add(_12triangle);
		card _13triangle = new card("13triangle", 13, "triangle", null); cards.add(_13triangle);
		card _14triangle = new card("14triangle", 14,"triangle", "GENERAL MARKET!"); cards.add(_14triangle);

		//STAR
		card _1star = new card("1star", 1,"star", "hold_on"); cards.add(_1star);
		card _2star = new card("2star", 1, "star", "pick_2"); cards.add(_2star);
		card _3star = new card("3star", 3,"star", null); cards.add(_3star);
		card _4star = new card("4star", 4, "star", null); cards.add(_4star);
		card _5star = new card("5star", 5, "star", null); cards.add(_5star);
		card _6star = new card("6star", 5, "star", null); cards.add(_6star);
		card _7star = new card("7star",7,"star",null); cards.add(_7star);
		card _8star = new card("8star", 8, "star", "suspension"); cards.add(_8star);
		card _9star = new card("9star", 1,"star", null); cards.add(_9star);
		card _10star = new card("10star", 1, "star", null); cards.add(_10star);
		card _11star = new card("11star", 11,"star", null); cards.add(_11star);
		card _12star = new card("12star", 12, "star", null); cards.add(_12star);
		card _13star = new card("13star", 13, "star", null); cards.add(_13star);
		card _14star = new card("14star", 14,"star", "GENERAL MARKET!"); cards.add(_14star);

		// WHOT CARDS
		card _20FLEX = new card("20FLEX", 20, "FLEX", "WILDCARD!"); cards.add(_20FLEX);
		return cards;

	}

	public void add(card card){
		cards.add(card);
	}



	public card peek_card(){
	return cards.peek();
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

