package com.example.main.model;

import java.util.Stack;

public class Deck {

	private Stack<Card> cards = new Stack<>();

	/**
	 * Generates a Deck of 52 cards
	 * @return Deck
	 */
	public static Deck generate()
	{
		Deck cardDeck = new Deck();

		String[] suit = {"Diamonds", "Clubs", "Hearts", "Spades"};
		String[] faceValues = {
				"Two", "Three", "Four", "Five",
				"Six", "Seven", "Eight", "Nine", "Ten",
				"Jack", "Queen", "King", "Ace"
		};

		for(int i = 0; i < suit.length; i++)
		{
			for(int j = 0; j < faceValues.length; j++ )
			{
				cardDeck.addCard(new Card(suit[i], faceValues[j] ));
			}

		}

		return cardDeck;
	}

	/**
	 * Retrieves the next card from the Deck.
	 * @return
	 */
	public Card getNext()
	{
		return cards.pop();
	}

	/**
	 * Returns the number of cards in the deck.
	 * @return int
	 */
	public int size()
	{
		return cards.size();
	}

	/**
	 * "Peeks" the top card in the deck without removing the card from the deck.
	 * @return Card
	 */
	public Card peekCard()
	{
		return cards.peek();
	}

	/**
	 * Returns the cards in the deck.
	 * @return Stack<Card>
	 */
	public Stack<Card> getCards()
	{

		return cards;

	}

	/**
	 * Adds card object to deck
	 * @param card
	 */

	public void addCard(Card card)
	{
		cards.push(card);
	}
}
