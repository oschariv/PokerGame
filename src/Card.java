/**
	 * Clase carta para crear las cartas de la baraja.
	 * Se usa la baraja francesa.
	 * 
	 * @author Oscar Charro Rivera
	 * @version 1.0
	 *
	 */

public final class Card {
	
	/**
	 * Palos de la baraja.
	 * SPADE - Picas.
	 * HEART - Corazones.
	 * DIAMOND - Diamantes.
	 * CLUB - Treboles.
	 */
	public static enum Suit{
		
	}
	/**
	 *  Rango de la baraja.
	 *  JACK - Jota
	 *  ACE - As
	 */
	public static enum Rank{
		TWO, TRHEE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
	}
	// Atributos.
	private final Suit suit;
	private final Rank rank;
	
	/**
	 * Contructor de la clase carta.
	 * @param suit establece el palo de la carta
	 * @param rank establece el rango de la carta
	 */
	public Card(Suit suit, Rank rank){
		this.suit = suit;
		this.rank = rank;
	}
	/**
	 * Devuelve el palo relativo de la carta.
	 * @return palo a la carta
	 */
	public Suit getSuit() {
		return suit;
	}
	/**
	 * Devuelve el rango relativo a la carta.
	 * @return rango de la carta
	 */
	public Rank getRank() {
		return rank;
	}
	
}
