package com.dang.ctci.treegraph;

import java.util.List;
import java.util.Stack;

import com.dang.ctci.common.GNode;
import com.dang.ctci.common.Graph;

public class BuildOrder {
  
  public Stack<String> findBuilOrder(String[] projects, String[][] dependencies) {
    Graph<String> graph = new Graph<>(projects);
    for (String[] edge: dependencies) {
      graph.addEdge(edge[0], edge[1]);
    }
    return orderProjects(graph.nodes);
  }
  
  private Stack<String> orderProjects(List<GNode<String>> projectNodes) {
    Stack<String> stack = new Stack<>();
    for (GNode<String> project: projectNodes) {
      if (project.getState() != GNode.State.COMPLETE) {
        dfs(project, stack);
      }
    }
    return stack;
  }
  
  private boolean dfs(GNode<String> project, Stack<String> stack) {
    if (project.getState() == GNode.State.PARTIAL) {
      return false;//Because there is cycle dependencies
    }
    
    if (project.getState() == GNode.State.BLANK) {
      project.setState(GNode.State.PARTIAL);
      List<GNode<String>> children = project.children;
      for (GNode<String> child: children) {
        if (!dfs(child, stack)) return false;
      }
      project.setState(GNode.State.COMPLETE);
      stack.push(project.data);
    }
    return true;
  }
  
  
  
}
