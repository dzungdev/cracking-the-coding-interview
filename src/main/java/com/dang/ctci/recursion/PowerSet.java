package com.dang.ctci.recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
  
  List<List<Integer>> getSubSets(List<Integer> set) {
    return null;
  }
  
  List<List<Integer>> getSubSets(List<Integer> set, int n) {
    List<List<Integer>> allSubSets = null;
    if (n == 0) {
      allSubSets = new ArrayList<>();
      allSubSets.add(new ArrayList<>());//empty set
    } else {
      allSubSets = getSubSets(set, n -1);
      Integer currentEle = set.get(n);
      List<List<Integer>> subSetHasCuurrentEle = new ArrayList<>();
      for (List<Integer> oldSubset: allSubSets) {
        List<Integer> oldSubsetWithCurrentEle = new ArrayList<>(oldSubset);
        oldSubset.add(currentEle);
        subSetHasCuurrentEle.add(oldSubsetWithCurrentEle);
      }
      allSubSets.addAll(subSetHasCuurrentEle);
    }
    return allSubSets;
  }
  
}
