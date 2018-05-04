package com.dang.ctci.treegraph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.dang.ctci.common.GNode;
import com.dang.ctci.common.Graph;

public class RouteBetweenNodes<T> {
  
  public boolean isExistedRoute(Graph<T> graph, GNode<T> start, GNode<T> end) {
    if (start == end) return true;
    LinkedList<GNode<T>> q = new LinkedList<GNode<T>>();
    q.add(start);
    while (!q.isEmpty()) {
      GNode<T> node = q.removeFirst();
      List<GNode<T>> children = node.children;
      for (GNode<T> child: children) {
        if (!child.isVisited) {
          if (child == end) return true;
          q.add(child);
        }
      }
      node.isVisited = true;
    }
    return false;
  }
  
}
