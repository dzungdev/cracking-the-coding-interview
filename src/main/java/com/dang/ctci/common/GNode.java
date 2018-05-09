package com.dang.ctci.common;

import java.util.ArrayList;
import java.util.List;

/**
 * This is class for Graph Node
 * @author alex
 *
 */
public class GNode<T> {
  
  public enum State {COMPLETE, PARTIAL, BLANK}
  
  public T data;
  public boolean isVisited;
  public List<GNode<T>> children = new ArrayList<GNode<T>>();
  private State state = State.BLANK;
  
  
  public GNode(T data) {
    this.data = data;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((data == null) ? 0 : data.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    GNode other = (GNode) obj;
    if (data == null) {
      if (other.data != null)
        return false;
    } else if (!data.equals(other.data))
      return false;
    return true;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }
  
}
