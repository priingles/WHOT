package priingles.personal;

import java.util.Collections;
import java.util.LinkedList;

public class Deck {
	LinkedList<Card> cards = new LinkedList<>();

	public LinkedList<Card> loadFull(){

		//SQUARES
		Card _1square = new Card("1square", 1, "square", "hold_on"); cards.add(_1square);
		Card _2square = new Card("2square", 2, "square", "pick_2"); cards.add(_2square);
		Card _3square = new Card("3square", 3, "square", null); cards.add(_3square);
		Card _4square = new Card("4square", 4, "square",  null); cards.add(_4square);
		Card _5square = new Card("5square", 5, "square", "pick_3"); cards.add(_5square);
		Card _6square = new Card("6square", 6, "square", null); cards.add(_6square);
		Card _7square = new Card("7square", 7, "square", null); cards.add(_7square);
		Card _8square = new Card("8square", 8,"square", "suspension"); cards.add(_8square);
		Card _9square = new Card("9square", 9,"square", null); cards.add(_9square);
		Card _10square = new Card("10square", 10, "square", null); cards.add(_10square);
		Card _11square = new Card("11square", 11, "square", null); cards.add(_11square);
		Card _12square = new Card("12square", 12, "square", null); cards.add(_12square);
		Card _13square = new Card("13square", 13, "square", null); cards.add(_13square);
		Card _14square = new Card("14square", 14, "square" ,"GENERAL MARKET!"); cards.add(_14square);

		//CIRCLES
		Card _1circle = new Card("1circle", 1,"circle", "hold_on"); cards.add(_1circle);
		Card _2circle = new Card("2circle", 1, "circle", "pick_2"); cards.add(_2circle);
		Card _3circle = new Card("3circle", 3,"circle", null); cards.add(_3circle);
		Card _4circle = new Card("4circle", 4, "circle", null); cards.add(_4circle);
		Card _5circle = new Card("5circle", 5, "circle", null); cards.add(_5circle);
		Card _6circle = new Card("6circle", 5, "circle", null); cards.add(_6circle);
		Card _7circle = new Card("7circle",7,"circle",null); cards.add(_7circle);
		Card _8circle = new Card("8circle", 8, "circle", "suspension"); cards.add(_8circle);
		Card _9circle = new Card("9circle", 1,"circle", null); cards.add(_9circle);
		Card _10circle = new Card("10circle", 1, "circle", null); cards.add(_10circle);
		Card _11circle = new Card("11circle", 11,"circle", null); cards.add(_11circle);
		Card _12circle = new Card("12circle", 12, "circle", null); cards.add(_12circle);
		Card _13circle = new Card("13circle", 13, "circle", null); cards.add(_13circle);
		Card _14circle = new Card("14circle", 14,"circle", "GENERAL MARKET!"); cards.add(_14circle);

		//CROSS
		Card _1cross = new Card("1cross", 1,"cross", "hold_on"); cards.add(_1cross);
		Card _2cross = new Card("2cross", 1, "cross", "pick_2"); cards.add(_2cross);
		Card _3cross = new Card("3cross", 3,"cross", null); cards.add(_3cross);
		Card _4cross = new Card("4cross", 4, "cross", null); cards.add(_4cross);
		Card _5cross = new Card("5cross", 5, "cross", null); cards.add(_5cross);
		Card _6cross = new Card("6cross", 5, "cross", null); cards.add(_6cross);
		Card _7cross = new Card("7cross",7,"cross",null); cards.add(_7cross);
		Card _8cross = new Card("8cross", 8, "cross", "suspension"); cards.add(_8cross);
		Card _9cross = new Card("9cross", 1,"cross", null); cards.add(_9cross);
		Card _10cross = new Card("10cross", 1, "cross", null); cards.add(_10cross);
		Card _11cross = new Card("11cross", 11,"cross", null); cards.add(_11cross);
		Card _12cross = new Card("12cross", 12, "cross", null); cards.add(_12cross);
		Card _13cross = new Card("13cross", 13, "cross", null); cards.add(_13cross);
		Card _14cross = new Card("14cross", 14,"cross", "GENERAL MARKET!"); cards.add(_14cross);

		//Triangle
		Card _1triangle = new Card("1triangle", 1,"triangle", "hold_on"); cards.add(_1triangle);
		Card _2triangle = new Card("2triangle", 1, "triangle", "pick_2"); cards.add(_2triangle);
		Card _3triangle = new Card("3triangle", 3,"triangle", null); cards.add(_3triangle);
		Card _4triangle = new Card("4triangle", 4, "triangle", null); cards.add(_4triangle);
		Card _5triangle = new Card("5triangle", 5, "triangle", null); cards.add(_5triangle);
		Card _6triangle = new Card("6triangle", 5, "triangle", null); cards.add(_6triangle);
		Card _7triangle = new Card("7triangle",7,"triangle",null); cards.add(_7triangle);
		Card _8triangle = new Card("8triangle", 8, "triangle", "suspension"); cards.add(_8triangle);
		Card _9triangle = new Card("9triangle", 1,"triangle", null); cards.add(_9triangle);
		Card _10triangle = new Card("10triangle", 1, "triangle", null); cards.add(_10triangle);
		Card _11triangle = new Card("11triangle", 11,"triangle", null); cards.add(_11triangle);
		Card _12triangle = new Card("12triangle", 12, "triangle", null); cards.add(_12triangle);
		Card _13triangle = new Card("13triangle", 13, "triangle", null); cards.add(_13triangle);
		Card _14triangle = new Card("14triangle", 14,"triangle", "GENERAL MARKET!"); cards.add(_14triangle);

		//STAR
		Card _1star = new Card("1star", 1,"star", "hold_on"); cards.add(_1star);
		Card _2star = new Card("2star", 1, "star", "pick_2"); cards.add(_2star);
		Card _3star = new Card("3star", 3,"star", null); cards.add(_3star);
		Card _4star = new Card("4star", 4, "star", null); cards.add(_4star);
		Card _5star = new Card("5star", 5, "star", null); cards.add(_5star);
		Card _6star = new Card("6star", 5, "star", null); cards.add(_6star);
		Card _7star = new Card("7star",7,"star",null); cards.add(_7star);
		Card _8star = new Card("8star", 8, "star", "suspension"); cards.add(_8star);
		Card _9star = new Card("9star", 1,"star", null); cards.add(_9star);
		Card _10star = new Card("10star", 1, "star", null); cards.add(_10star);
		Card _11star = new Card("11star", 11,"star", null); cards.add(_11star);
		Card _12star = new Card("12star", 12, "star", null); cards.add(_12star);
		Card _13star = new Card("13star", 13, "star", null); cards.add(_13star);
		Card _14star = new Card("14star", 14,"star", "GENERAL MARKET!"); cards.add(_14star);

		// WHOT CARDS
		Card _WHOT = new Card("1", 20, "WHOT", "BIG FLEX!"); cards.add(_WHOT);
		Card _2WHOT = new Card("2", 20, "WHOT", "BIG FLEX!"); cards.add(_2WHOT);
		Card _3WHOT = new Card("3", 20, "WHOT", "BIG FLEX!"); cards.add(_3WHOT);
		Card _4WHOT = new Card("4", 20, "WHOT", "BIG FLEX!"); cards.add(_4WHOT);
		Card _5WHOT = new Card("5", 20, "WHOT", "BIG FLEX!"); cards.add(_5WHOT);
		return cards;

	}

	public LinkedList<Card> loadTrad(){


		//SQUARES
		Card _1square = new Card("1square", 1, "square", "hold_on"); cards.add(_1square);
		Card _2square = new Card("2square", 2, "square", "pick_2"); cards.add(_2square);
		Card _3square = new Card("3square", 3, "square", null); cards.add(_3square);
		Card _5square = new Card("5square", 5, "square", "pick_3"); cards.add(_5square);
		Card _7square = new Card("7square", 7, "square", null); cards.add(_7square);
		Card _10square = new Card("10square", 10, "square", null); cards.add(_10square);
		Card _11square = new Card("11square", 11, "square", null); cards.add(_11square);
		Card _13square = new Card("13square", 13, "square", null); cards.add(_13square);
		Card _14square = new Card("14square", 14, "square" ,"GENERAL MARKET!"); cards.add(_14square);

		//CIRCLES
		Card _1circle = new Card("1circle", 1,"circle", "hold_on"); cards.add(_1circle);
		Card _2circle = new Card("2circle", 1, "circle", "pick_2"); cards.add(_2circle);
		Card _3circle = new Card("3circle", 3,"circle", null); cards.add(_3circle);
		Card _4circle = new Card("4circle", 4, "circle", null); cards.add(_4circle);
		Card _5circle = new Card("5circle", 5, "circle", null); cards.add(_5circle);
		Card _7circle = new Card("7circle",7,"circle",null); cards.add(_7circle);
		Card _8circle = new Card("8circle", 8, "circle", "suspension"); cards.add(_8circle);
		Card _10circle = new Card("10circle", 1, "circle", null); cards.add(_10circle);
		Card _11circle = new Card("11circle", 11,"circle", null); cards.add(_11circle);
		Card _12circle = new Card("12circle", 12, "circle", null); cards.add(_12circle);
		Card _13circle = new Card("13circle", 13, "circle", null); cards.add(_13circle);
		Card _14circle = new Card("14circle", 14,"circle", "GENERAL MARKET!"); cards.add(_14circle);

		//CROSS
		Card _1cross = new Card("1cross", 1,"cross", "hold_on"); cards.add(_1cross);
		Card _2cross = new Card("2cross", 1, "cross", "pick_2"); cards.add(_2cross);
		Card _3cross = new Card("3cross", 3,"cross", null); cards.add(_3cross);
		Card _5cross = new Card("5cross", 5, "cross", null); cards.add(_5cross);
		Card _7cross = new Card("7cross",7,"cross",null); cards.add(_7cross);
		Card _10cross = new Card("10cross", 1, "cross", null); cards.add(_10cross);
		Card _11cross = new Card("11cross", 11,"cross", null); cards.add(_11cross);
		Card _13cross = new Card("13cross", 13, "cross", null); cards.add(_13cross);
		Card _14cross = new Card("14cross", 14,"cross", "GENERAL MARKET!"); cards.add(_14cross);

		//Triangle
		Card _1triangle = new Card("1triangle", 1,"triangle", "hold_on"); cards.add(_1triangle);
		Card _2triangle = new Card("2triangle", 1, "triangle", "pick_2"); cards.add(_2triangle);
		Card _3triangle = new Card("3triangle", 3,"triangle", null); cards.add(_3triangle);
		Card _4triangle = new Card("4triangle", 4, "triangle", null); cards.add(_4triangle);
		Card _5triangle = new Card("5triangle", 5, "triangle", null); cards.add(_5triangle);
		Card _7triangle = new Card("7triangle",7,"triangle",null); cards.add(_7triangle);
		Card _8triangle = new Card("8triangle", 8, "triangle", "suspension"); cards.add(_8triangle);
		Card _10triangle = new Card("10triangle", 1, "triangle", null); cards.add(_10triangle);
		Card _11triangle = new Card("11triangle", 11,"triangle", null); cards.add(_11triangle);
		Card _12triangle = new Card("12triangle", 12, "triangle", null); cards.add(_12triangle);
		Card _13triangle = new Card("13triangle", 13, "triangle", null); cards.add(_13triangle);
		Card _14triangle = new Card("14triangle", 14,"triangle", "GENERAL MARKET!"); cards.add(_14triangle);

		//STAR
		Card _1star = new Card("1star", 1,"star", "hold_on"); cards.add(_1star);
		Card _2star = new Card("2star", 1, "star", "pick_2"); cards.add(_2star);
		Card _3star = new Card("3star", 3,"star", null); cards.add(_3star);
		Card _4star = new Card("4star", 4, "star", null); cards.add(_4star);
		Card _5star = new Card("5star", 5, "star", null); cards.add(_5star);
		Card _7star = new Card("7star",7,"star",null); cards.add(_7star);
		Card _8star = new Card("8star", 8, "star", "suspension"); cards.add(_8star);


		// WHOT CARDS
		Card _WHOT = new Card("1", 20, "WHOT", "BIG FLEX!"); cards.add(_WHOT);
		Card _2WHOT = new Card("2", 20, "WHOT", "BIG FLEX!"); cards.add(_2WHOT);
		Card _3WHOT = new Card("3", 20, "WHOT", "BIG FLEX!"); cards.add(_3WHOT);
		Card _4WHOT = new Card("4", 20, "WHOT", "BIG FLEX!"); cards.add(_4WHOT);
		Card _5WHOT = new Card("5", 20, "WHOT", "BIG FLEX!"); cards.add(_5WHOT);

		return cards;
	}


	public void add(Card card){
		cards.add(card);
	}

	public boolean status(){
		if(cards.isEmpty()){
			return false;
		}
		return true;
	}

	public Card peekCard(){
	return cards.peek();
}

	public Card getCard(){
		return cards.pop();
	}

	public LinkedList<Card> getDeck(){
	return cards;
}

	public void shuffle(){
	Collections.shuffle(cards);
}
}

