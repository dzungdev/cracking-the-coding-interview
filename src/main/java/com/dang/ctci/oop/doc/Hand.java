package com.dang.ctci.oop.doc;

import java.util.ArrayList;
import java.util.List;

public class Hand<T extends Card> {
  
  protected List<T> cards = new ArrayList<>();
  
  public int score() {
    return cards.stream().mapToInt(e -> e.value()).sum();
  }
 
  public void takeCard(T card) {
    cards.add(card);
  }
}
