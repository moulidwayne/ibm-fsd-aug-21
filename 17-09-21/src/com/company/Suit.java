package com.company;

public enum Suit {
SPADES("Spades"),
 HEARTS("Hearts"),
 CLUBS("Clubs"),
 DIAMONDS("Diamonds");

 private String message;

 private Suit(String message) {
  this.message = message;
 }
 public String getSuitName()
 {
  return message;
 }

}