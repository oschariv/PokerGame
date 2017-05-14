package main;
/**
 * Clase Mano para definir la mano de un jugador.
 * @author oscar
 * @version 1.0
 */
public final class Hands {
	// Atributos.
	public static final int CARDS = 5;
	/**
	 * Tipo de Mano que tenemos.
	 */
	public enum Type {
	HIGH_CARD,
	ONE_PAIR,
	TWO_PAIR,
	THREE_OF_A_KIND,
	STRAIGHT,
	FLUSH,
	FULL_HOUSE,
	FOUR_OF_A_KIND,
	STRAIGHT_FLUSH
	}
	private Hands() {
	}
}
