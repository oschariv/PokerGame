package main;
// Imports
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Constructor de clase Baraja(DecK)
 * @author Oscar Charro Rivera
 * @version 1.0
 */
public class Deck {
	private final List<Card> cards;
	private int index = 0;
	/**
	 * Constructor de la clase, no tiene parametros.
	 */
	public Deck() {
		this.cards = getAllCards();
	}
	/**
	 * Metodo para obtener ua carta.
	 * @return La carta resultante.
	 */
	public Card obtainCard() {
		Card result = null;
		if (index < cards.size()) {
			result = cards.get(index);
			index++;
		}
		return result;
	}
	/**
	 * Metodo para mezclar las cartas.
	 * Devuelve el indice a la posicion inicial.
	 */
	public void shuffle() {
		index = 0;
		Collections.shuffle(cards);
	}
	/**
	 * Lista todas las cartas de la baraja.
	 * @return Las cartas de la baraja.
	 */
	public static List<Card> getAllCards() {
		int numCards = Card.Suit.values().length * Card.Rank.values().length;
		List<Card> result = new ArrayList<>(numCards);
		for (Card.Suit suit : Card.Suit.values()) {
			for (Card.Rank rank : Card.Rank.values()) {
				result.add(new Card(suit, rank));
			}
		}
		return result;
	}
}
