package com.company;

public class PlayingCards {
    // pseudo enumerated type

    private Suit suit;

   // private int suit;
    private int rank;
/*
    public PlayingCards(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }*/

    public PlayingCards(Suit suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

  /*  public String getSuitName() {
        String name = "";
        switch (suit) {
            case SUIT_SPADES:
                name = "Spades";
                break;
            case SUIT_HEARTS:
                name = "Hearts";
                break;
            case SUIT_CLUBS:
                name = "Clubs";
                break;
            case SUIT_DIAMONDS:
                name = "Diamonds";
                break;
            default:
                System.err.println("Invalid suit.");
        }
        return name;
    }
*/
    public int getRank() {
        return rank;
    }
}
