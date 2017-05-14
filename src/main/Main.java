package main;

import java.util.HashSet;
import java.util.Set;

public class Main {
	
	/**
	 * Metodo para insertar cartas en un HashSet.
	 * 
	 * @param cards para obtener el set de cartas.
	 * @param card para obtener la carta a guardar.
	 */
	private static void insert(Set<Card> cards, Card card){
		if(!cards.contains(card)){
			System.out.println("Insertamos la carta: " + card);
			cards.add(card);
		} else {
			System.out.println("la carta: " + card + " ya estaba en el conjunto " );
		}
	}
	/**
	 * Metodo main para auto ejucutar el juego.
	 * 
	 * @param args para obtener los argumentos.
	 */
	public static void main(String[] args) {
		Set<Card> cards = new HashSet<>();
		Card[] cards2Insert = {
			new Card(Card.Suit.CLUB, Card.Rank.ACE),
			new Card(Card.Suit.CLUB, Card.Rank.TWO),
			new Card(Card.Suit.CLUB, Card.Rank.TRHEE),
			new Card(Card.Suit.CLUB, Card.Rank.ACE)
		};
		for (Card card : cards2Insert) {
			insert(cards, card);
		}

	}

}
