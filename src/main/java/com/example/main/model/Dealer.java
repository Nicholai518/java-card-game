package com.example.main.model;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Dealer {

	private Deck deck;

	public Dealer(Deck deck)
	{
		this.deck = deck;
	}

	/**
	 * Shuffles the dealers deck.
	 */
	public void shuffleDeck()
	{
		Collections.shuffle(deck.getCards());
	}

	/**
	 * Retrieves the deck.
	 * @return Deck
	 */
	public Deck getDeck()
	{
		return deck;
	}

	/**
	 * Returns a list of cards from the dealers deck.
	 * @param numberOfCards the number of cards to include in the dealed cards list.
	 * @return List<Card>
	 */
	public List<Card> dealCards(int numberOfCards)
	{
		List<Card> dealtCards = new LinkedList<>();
		for(int i = 0; i < numberOfCards; i++)
		{
			dealtCards.add(deck.getNext());
		}

		return dealtCards;
	}
}
