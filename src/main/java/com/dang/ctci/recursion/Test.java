package com.dang.ctci.recursion;

import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.AbstractMap.SimpleEntry;

public class Test {
  
  public static List<List<Integer>> combine(int[] arr, int k) {
    List<List<Integer>> combs = new ArrayList<List<Integer>>();
    combine(combs, new ArrayList<Integer>(), 0, arr, k);
    return combs;
  }
  public static void combine(List<List<Integer>> combs, List<Integer> comb, int start, int[] arr, int k) {
    if(k==0) {
      combs.add(new ArrayList<Integer>(comb));
      return;
    }
    for(int i=start;i< arr.length;i++) {
      comb.add(i);
      combine(combs, comb, i+1, arr, k-1);
      comb.remove(comb.size()-1);
    }
  }

  public static void main(String[] args) {
    Instant start = Instant.now();
    int n = 18000;
    String kpi = "seattle_edr_3G_";
    String[] kpis = new String[n];
    for (int i = 0; i < n; i++) {
      kpis[i] = kpi + i;
    }
    int[] kpiIds = new int[n];
    for (int i = 0; i < n;i++) {
      kpiIds[i] = kpis[i].hashCode();
    }
    
//    System.out.println(BigInteger.valueOf(2).pow(18000).multiply(BigInteger.valueOf(11)));
    
//    List<List<Integer>> results = combine(kpiIds, 2);
//    System.out.println("results size: " + results.size());
//    Instant end = Instant.now();
//    Duration duration = Duration.between(start, end);
//    System.out.println("millisecond: " + duration.toMillis());
  }

}
