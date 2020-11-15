package com.example.main.model;

public class Card {

	// Fields
	private String suit;
	private String faceValue;

	// Constructor
	public Card(String suit, String faceValue)
	{
	this.suit = suit;
	this.faceValue = faceValue;
	}

	// Methods
	// Getters
	public String getSuit()
	{
		return suit;
	}

	public String getFaceValue()
	{
		return faceValue;
	}

	public String getDisplayText()
	{
		// Test! Needs to match test text. "Queen of Diamonds"
		return getFaceValue() + " of " + getSuit();
	}
}
