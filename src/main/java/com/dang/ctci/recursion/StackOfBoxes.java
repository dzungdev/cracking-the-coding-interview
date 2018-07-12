package com.dang.ctci.recursion;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

class Box {
  
  private int height;
  private int width;
  private int wide;
  
  public Box(int height, int width, int wide) {
    super();
    this.height = height;
    this.width = width;
    this.wide = wide;
  }
  
  public boolean canBeBelow(Box b) {
    if (b == null) return false;
    return this.height < b.getHeight() && this.width < b.getWidth() && this.wide < b.getWide();
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getWide() {
    return wide;
  }

  public void setWide(int wide) {
    this.wide = wide;
  }
  
}

public class StackOfBoxes {
  
  private int createStack(List<Box> boxes, int bottomBoxIndex) {
    Box bottomBox = boxes.get(bottomBoxIndex);
    //the last box in box list
    if (bottomBoxIndex == boxes.size() - 1) return bottomBox.getHeight();
    
    int maxHeight = 0;
    for (int i = bottomBoxIndex + 1; i < boxes.size(); i++) {
      if (bottomBox.canBeBelow(boxes.get(i))) {
        int height = createStack(boxes, i);
        maxHeight = Math.max(maxHeight, height);
      }
    }
    maxHeight += bottomBox.getHeight();
    return maxHeight;
  }
  
  public int createStack(List<Box> boxes) {
    Comparator<Box> comparator = (Box box1, Box box2) -> box2.getHeight() - box1.getHeight();
    Collections.sort(boxes, comparator);
    int maxHeight = 0;
    for (int i = 0; i < boxes.size(); i++) {
      int height = createStack(boxes, i);
      maxHeight = Math.max(maxHeight, height);
    }
    return maxHeight;
  }
  
  private static Box createBox() {
    Random r = new Random();
    return new Box(r.nextInt(100), r.nextInt(100), r.nextInt(100));
  }
  
  public static void main(String[] args) {
    
    List<Box> boxes = Arrays.asList(createBox(), createBox(), createBox(), createBox());
    StackOfBoxes app = new StackOfBoxes();
    int maxHeight = app.createStack(boxes);
    
    for(int i = 0; i < boxes.size();i++) {
      Box box = boxes.get(i);
      System.out.println("height: " + box.getHeight() + ", width: " + box.getWidth() + ",wide: " + box.getWide());
    }
    
    System.out.println(maxHeight);
    
  }
  
}
