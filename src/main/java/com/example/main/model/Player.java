package com.example.main.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Player {

	// Fields
	private String name;
	private List<Card> hand = new LinkedList<>();

	// Constructors

	// Default Constructor
	public Player()
	{
		this.name = "Player";

	}

	/**
	 * Create a player given a name.
	 * @param name
	 */
	public Player(String name)
	{
		this.name = name;
	}

	/**
	 * Create a player given list of cards.
	 * @param hand
	 */
	public Player(List<Card> hand)
	{
		this.hand = hand;
	}

	/**
	 * Create a player given a player name and  list of cards.
	 * @param name
	 * @param hand
	 */
	public Player(String name, List<Card> hand)
	{
		this.name = name;
		this.hand = hand;
	}


	/**
	 * Adds a card to the players hand.
	 * @param card
	 */
	public void addCardToHand(Card card)
	{
		hand.add(card);
	}

	/**
	 * Returns the list of cards in the players hand.
	 * @return
	 */
	public List<Card> getHand()
	{
		return hand;
	}

	/**
	 * Replaces the players hand with a new list of cards.
	 * @param newHand
	 */
	public void replaceHand(List<Card> newHand)
	{
		hand = newHand;  // TODO: Need to check to see if newHand REPLACES hand
	}

	/**
	 * Returns the players name;
	 * @return
	 */
	public String getName()
	{
		return name;
	}
}
