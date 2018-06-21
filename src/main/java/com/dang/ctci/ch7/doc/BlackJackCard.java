package com.dang.ctci.ch7.doc;

public class BlackJackCard extends Card {

  public BlackJackCard(int value, Suit suit) {
    super(value, suit);
  }

  @Override
  public int value() {
    if (isAce())
      return 1;
    else if (faceValue >= 11 && faceValue <= 13)
      return 10;
    else
      return faceValue;
  }

  public boolean isAce() {
    return this.faceValue == 1;
  }
  
  public int minValue() {
    return isAce() ? 1 : value();
  }
  
  public int maxValue() {
    return isAce() ? 11 : value();
  }
  
  public boolean isFaceCard() {
    return faceValue >= 11 && faceValue <= 13;
  }

}
