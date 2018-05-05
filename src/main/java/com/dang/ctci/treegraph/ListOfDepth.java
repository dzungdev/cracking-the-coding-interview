package com.dang.ctci.treegraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.dang.ctci.common.InputClazz;
import com.dang.ctci.common.TreeNode;

public class ListOfDepth<T> {
  
  public List<LinkedList<TreeNode<T>>> createDepthLinkedList(TreeNode<T> root) {
    List<LinkedList<TreeNode<T>>> depthList = new ArrayList<LinkedList<TreeNode<T>>>();
    createDepthLinkedList(root, depthList, 0);
    return depthList;
  }
  
  public void createDepthLinkedList(TreeNode<T> root,List<LinkedList<TreeNode<T>>> depthList, int level) {
    if (root == null) return;//base case
    LinkedList<TreeNode<T>> list = null;
    if (depthList.size() == level) {
      //because list index start from 0, so if size = level, mean we need to create new list as it is deeper level
      list = new LinkedList<TreeNode<T>>();
      depthList.add(list);
    } else {
      list = depthList.get(level);
    }
    list.add(root);
    createDepthLinkedList(root.left, depthList, level + 1);
    createDepthLinkedList(root.right, depthList, level + 1);
  }
  
  public List<LinkedList<TreeNode<T>>> createDepthLinkedListByBFS(TreeNode<T> root) {
    List<LinkedList<TreeNode<T>>> result = new ArrayList<LinkedList<TreeNode<T>>>();
    if (root == null) return result;
    LinkedList<TreeNode<T>> currentLevel = new LinkedList<TreeNode<T>>();
    currentLevel.add(root);
    while (!currentLevel.isEmpty()) {
      result.add(currentLevel);
      LinkedList<TreeNode<T>> parentLevel = currentLevel;//we use one parentLevel variable to prepare to go next level
      currentLevel = new LinkedList<TreeNode<T>>();
      for (TreeNode<T> node: parentLevel) {
        if (node.left != null) currentLevel.add(node.left);
        if (node.right != null) currentLevel.add(node.right);
      }
      
    }
    return result;
  }
  
  public static void main(String[] args) {
    TreeNode<Integer> root = InputClazz.createBinaryTree(new Integer[] {1,2,3,4,5,6,7});
    ListOfDepth<Integer> app = new ListOfDepth<Integer>();
    List<LinkedList<TreeNode<Integer>>> list =  app.createDepthLinkedListByBFS(root);
    System.out.println("list size: " + list.size());
    System.out.println("left: " + root.left.data + ", right: " + root.right.data);
    list.forEach(l -> {
      for(TreeNode<Integer> n: l) {
        System.out.print(n.data + " ");
      }
      System.out.println("");
    });
  }
  
}
