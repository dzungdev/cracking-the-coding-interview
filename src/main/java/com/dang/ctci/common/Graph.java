package com.dang.ctci.common;

import java.util.ArrayList;
import java.util.List;

public class Graph<T> {

  public int            numberOfVertice;
  public List<GNode<T>> nodes;

  public Graph(int numberOfVertice) {
    this.numberOfVertice = numberOfVertice;
    nodes = new ArrayList<GNode<T>>();
  }

  public void addEdge(T v, T w) {
    GNode<T> vNode = new GNode<T>(v);
    GNode<T> wNode = new GNode<T>(w);
    if (nodes.contains(vNode)) {
      vNode = nodes.get(nodes.indexOf(vNode));
    } else {
      nodes.add(vNode);
    }
    if (nodes.contains(wNode)) {
      wNode = nodes.get(nodes.indexOf(wNode));
    } else {
      nodes.add(wNode);
    }
    vNode.children.add(wNode);
  }

}
