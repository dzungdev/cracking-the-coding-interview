package com.dang.ctci.treegraph;

import java.util.HashMap;
import java.util.Map;

import com.dang.ctci.common.TreeNode;

public class PathsWithSum {
  
  public int countPathWithSumStartBF(TreeNode<Integer> root, int targetSum) {
    if (root == null) return 0;
    int countPathAtRoot = countPathWithSumStartFromNodeBF(root, targetSum, 0);
    int leftChildPathCount = countPathWithSumStartBF(root.left, targetSum);
    int rightChildPathCount = countPathWithSumStartBF(root.left, targetSum);
    
    return countPathAtRoot + leftChildPathCount + rightChildPathCount;
  }
  
  private int countPathWithSumStartFromNodeBF(TreeNode<Integer> node, int targetSum, int parentSum) {
    if (node == null) return 0;
    int totalPath = 0;
    if (node.data + parentSum == targetSum) totalPath++;
    totalPath += countPathWithSumStartFromNodeBF(node.left, targetSum, node.data + parentSum);
    totalPath += countPathWithSumStartFromNodeBF(node.right, targetSum, node.data + parentSum);
    return totalPath;
  }
  
  public int countPathsWithSum(TreeNode<Integer> root, int targetSum) {
    return 0;
  }
  
  public int countPath(TreeNode<Integer> root, int target) {
    Map<Integer, Integer> visitedMap = new HashMap<>(); 
    return backtrack(root, target, 0, visitedMap);
  }
  
  public int backtrack(TreeNode<Integer> node, int target, int parentSum, Map<Integer, Integer> visitedMap) {
    if (node == null) return 0;
    
    int currentSum = parentSum + node.data;
    int totalPaths = visitedMap.getOrDefault(currentSum - target, 0);
    visitedMap.put(currentSum, visitedMap.getOrDefault(currentSum, 0) + 1);
    totalPaths += backtrack(node.left, target, currentSum, visitedMap) + backtrack(node.right, target, currentSum, visitedMap);
    visitedMap.put(currentSum, visitedMap.get(currentSum) - 1);
    return totalPaths;
  }
  
}