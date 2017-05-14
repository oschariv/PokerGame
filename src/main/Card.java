package main;

/**
 * Clase carta para crear las cartas de la baraja. Se usa la baraja francesa.
 * 
 * @author Oscar Charro Rivera
 * @version 1.0
 *
 */

public final class Card {

	/**
	 * Palos de la baraja. SPADE - Picas. HEART - Corazones. DIAMOND -
	 * Diamantes. CLUB - Treboles.
	 */
	public static enum Suit {
		SPADE, HEART, DIAMOND, CLUB
	}

	/**
	 * Rango de la baraja. JACK - Jota ACE - As
	 */
	public static enum Rank {
		TWO, TRHEE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
	}

	// Atributos.
	private final Suit suit;
	private final Rank rank;
	private static final String STRING_RANK_CARDS = "23456789TJQKA";

	/**
	 * Contructor de la clase carta.
	 * 
	 * @param suit
	 *            establece el palo de la carta
	 * @param rank
	 *            establece el rango de la carta
	 */
	public Card(Suit suit, Rank rank) {
		// Para no que no establezcan valores nulos.
		if (suit == null) {
			throw new IllegalArgumentException("suit no puede tener un valor nulo");
		}
		// Para no que no establezcan valores nulos.
		if (rank == null) {
			throw new IllegalArgumentException("rank no puede tener un valor nulo");
		}

		this.suit = suit;
		this.rank = rank;
	}

	/**
	 * Devuelve el palo relativo de la carta.
	 * 
	 * @return palo a la carta
	 */
	public Suit getSuit() {
		return suit;
	}

	/**
	 * Devuelve el rango relativo a la carta.
	 * 
	 * @return rango de la carta
	 */
	public Rank getRank() {
		return rank;
	}

	/**
	 * Metodo toString sobreescrito.
	 * 
	 * @return La carta con el rango y el palo.
	 */
	@Override
	public String toString() {
		int rankValue = rank.ordinal();
		return STRING_RANK_CARDS.substring(rankValue, rankValue + 1).concat(suit.name().substring(0, 1));
	}

	@Override
	public int hashCode() {
		return rank.ordinal() * Suit.values().length + suit.ordinal();
	}
	/**
	 * Metodo sobreescrito que comprueba si hay valores repetidos.
	 * 
	 * @return si hay carta o no repetida.
	 */
	@Override
	public boolean equals(Object obj) {
		boolean result = true;
		if (this != obj) {
			result = false;
			if (obj != null && getClass() == obj.getClass()) {
				result = hashCode() == ((Card) obj).hashCode();
			}
		}
		return result;
	}
}
