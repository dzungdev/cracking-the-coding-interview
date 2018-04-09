package com.dang.ctci.arr;

import java.util.HashMap;

public class PalindromePermutation {
  
  /**
   * We need to understand what is permutation of palindrome string.
   * 
   * permuation means the letters of string can be re-arranged for position
   * palindrome string mean it is same for backward or forward reading. 
   * 
   * the problem is if we generate all permutation of string and then for each permuation string we check
   * palindrome or not, then the time complexity will be factoria (n!) so we need to avoid it.
   * 
   *  Because the permutation is re-arrange letters so it means that we don't need to generate permuation string for
   *  input, we just need to make sure the input is eligible for palindrome string.
   *  
   *  The rule of original palindrome is:
   *      1. str length is odd, so the middle letter appear 1 and other letter has opposite position compare with center: for example acbca
   *      2. str length is even, so each leter at 1 posistion must have opposite position, mean each letter should have even frequently
   *      
   *  Because the permutation, so we don't need to make sure the position is opposite. E.g: acbca, mean a must be in position: 0 and 4, it can be
   *  aacbc (then it can be permuted)
   *  
   *  So the rule for this problem is: we shouldn't have more than one letter appear odd times 
   *  (I read the solutions from book but explained as I understand) 
   *  
   *  For this, we can use HashMap to store the appear frequently of each character, then count how many characters which have odd frequently,
   *  if it is more than 1 then return false, if not we return true.
   * 
   * @param str
   * @return boolean true/false
   */
  public boolean isPalindromePermutation(String str) {
    HashMap<Integer, Integer> charCnt = new HashMap<Integer, Integer>();
    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      int charNum = getCharNums(chars[i]);
      charCnt.put(charNum, charCnt.getOrDefault(charNum, 0) + 1);
    }
    int oddFrequentChar = 0;
    for (int charNum: charCnt.keySet()) {
      if (charNum == -1) continue;
      int charFrequentCnt = charCnt.get(charNum);
      if (charFrequentCnt % 2 != 0) oddFrequentChar++;
    }
    return oddFrequentChar < 2;
  }
  
  int getCharNums(Character c) {
    int a = Character.getNumericValue('a');
    int z = Character.getNumericValue('z');
    int val = Character.getNumericValue(c);
    
    if (a <= val && val <= z) {
      return val - a;
    }
    return -1;//incase it is non-letter like space
  }
  
  public static void main(String[] args) {
    PalindromePermutation app = new PalindromePermutation();
    System.out.println(app.isPalindromePermutation("Tact Coa"));
  }
  
}
