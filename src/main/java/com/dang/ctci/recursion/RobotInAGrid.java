package com.dang.ctci.recursion;

import java.util.ArrayList;
import java.util.List;

public class RobotInAGrid {

  class Location {
    public int row;
    public int col;

    public Location(int row, int col) {
      this.row = row;
      this.col = col;
    }

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + getOuterType().hashCode();
      result = prime * result + col;
      result = prime * result + row;
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
      Location other = (Location) obj;
      if (!getOuterType().equals(other.getOuterType()))
        return false;
      if (col != other.col)
        return false;
      if (row != other.row)
        return false;
      return true;
    }

    private RobotInAGrid getOuterType() {
      return RobotInAGrid.this;
    }
    
  }

  public boolean isSafeLocation(int[][] maze, int row, int col) {
    return (row >= 0 && row < maze.length && col >= 0 && col < maze[0].length && maze[row][col] == 1);
  }

  public boolean getPath(int[][] maze, int row, int col, List<Location> paths, List<Location> failedLocations) {
    System.out.println("row:" + row + ",col:" + col);
    Location loc = new Location(row, col); 
    if (row == maze.length - 1 && col == maze[0].length - 1) {
      paths.add(loc);
      return true;
    } else {
      if (isSafeLocation(maze, row, col)) {
        if (failedLocations.contains(loc)) {
          return false;
        }
        
        if (getPath(maze, row, col + 1, paths, failedLocations) ||
            getPath(maze, row + 1, col, paths, failedLocations)) {
          paths.add(loc);
          return true;
        }
        
        // backtracking
        failedLocations.add(loc);
        return false;
      }
      return false;
    }
  }

  public List<Location> getPath(int[][] maze) {
    List<Location> paths = new ArrayList<>();
    List<Location> failedLocations = new ArrayList<>();
    getPath(maze, 0, 0, paths, failedLocations);
    return paths;
  }

  // book solutions
  List<Location> getPath(boolean[][] maze) {
    List<Location> path = new ArrayList<>();
    getPath(maze, maze.length - 1, maze[0].length - 1, path);
    return path;
  }
  
  boolean getPath(boolean[][] maze, int row, int col, List<Location> path) {
    System.out.println("row:" + row + ",col:" + col);
    if (col < 0 || row < 0 || !maze[row][col]) {
      return false;
    }
    boolean isAtTopLeft = (row == 0) && (col == 0);
    
    if (isAtTopLeft || getPath(maze, row, col - 1, path)
          || getPath(maze, row - 1, col, path)) {
      path.add(new Location(row, col));
      return true;
    }
    return false;
  }
  

  public static void main(String[] args) {
    RobotInAGrid app = new RobotInAGrid();
    int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
    
//    boolean maze[][] = { { true, false, false, false }, { true, true, false, true }, { false, true, false, false }, { true, true, true, true } };
    List<Location> paths = app.getPath(maze);
    paths.stream().forEach(e -> {
      System.out.println("(" + e.row + "," + e.col + "), ");
    });
  }
}
