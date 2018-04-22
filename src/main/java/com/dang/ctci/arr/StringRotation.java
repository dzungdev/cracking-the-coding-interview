package com.dang.ctci.arr;

public class StringRotation {
  
  /**
   * s1 = waterbottle
   * s2 =  erbottlewag
   * The solutions is we will loop through each character of s2 until the word doesn't belong to s1, then we cut that word from s2
   * then repeat the loop until end of s2, if we can loop through all character of s2, then it is Rotation
   * 
   * loop
   * e belong s1
   * er belong s1
   * erb belong s1
   * erbo belong s1
   * erbot belong s1
   * erbott belong s1
   * erbottl belong s1
   * erbottle belong s1
   * erbottlew doesn't belong s1 
   *    --> cut erbottle from both of string, mean s1 = wat now, s2 = watg
   *    --> loop with w belong to s1
   * wa belong to s1
   * wag doesn't belong to s1
   *    --> cut wa from both of string, mean s1 = t, s2 = g now
   * g doesn't belong s1 and finished loop through s2 --> isRotation = false 
   * 
   * @param s1
   * @param s2
   * @return boolean true/false for isRotation
   */
  
  public boolean isRotation(String s1, String s2) {
    char[] c2 = s2.toCharArray();
    StringBuilder prevWord = new StringBuilder("");
    for (char c: c2) {
      if (!s1.contains(Character.toString(c))) return false;
      String currWord = prevWord.append(c).toString();
      if (!s1.contains(currWord)) {
        s1 = s1.replace(prevWord.deleteCharAt(prevWord.length()-1), "");
        prevWord = new StringBuilder(c);
      } 
    }
    return true;
  }
  
  public static void main(String[] args) {
    StringRotation app = new StringRotation();
    System.out.println(app.isRotation("erbottlewat", "waterbottle"));
  }
  
}
