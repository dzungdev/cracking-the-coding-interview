package com.dang.ctci.treegraph;

import com.dang.ctci.common.GNode;
import com.dang.ctci.common.Graph;

public class DFS {

  public <T> void dfs(Graph<T> graph, T v) {
    GNode<T> root = null;
    for (GNode<T> node: graph.nodes) {
      if (node.data == v) {
        root = node;
        break;
      }
    }
    dfsHelper(root);
  }
  
  private <T> void dfsHelper(GNode<T> node) {
    node.isVisited = true;
    System.out.println(node.data + " ");
    for (GNode<T> child : node.children) {
      if (!child.isVisited) {
        dfsHelper(child);
      }
    }
  }

  public static void main(String[] args) {
    DFS app = new DFS();
    Graph<Integer> graph = new Graph<Integer>(4);
    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 2);
    graph.addEdge(2, 0);
    graph.addEdge(2, 3);
    graph.addEdge(3, 3);
    
    app.dfs(graph, 2);
  }

}
