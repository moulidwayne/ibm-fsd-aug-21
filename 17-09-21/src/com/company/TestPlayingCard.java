package com.company;

public class TestPlayingCard {
public static void main(String[] args) {

PlayingCards card1 = new PlayingCards(Suit.SPADES, 2);
System.out.println("card1 is the " + card1.getRank()+ " of " + Suit.SPADES.getSuitName());

 // You can create a playing card with a bogus suit.
 PlayingCards card2 = new PlayingCards(Suit.DIAMONDS, 3);
 System.out.println("card2 is the " + card2.getRank()+" of " + Suit.DIAMONDS.getSuitName());
 }
 }