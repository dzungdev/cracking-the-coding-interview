package com.dang.ctci.ch7.doc;

import java.util.List;

public class Deck<T extends Card> {
  
  private List<T> cards;
  private int dealtIndex = 0;
  
  public void setDeckOfCards(List<T> deckOfCards) {}
  public void shuffle() {}
  public int getRemainingCards() {
    return cards.size() - dealtIndex;
  }
  
  public List<T> dealHand(int number) {return null;}
  public T dealCard() {return null;}
  
}
