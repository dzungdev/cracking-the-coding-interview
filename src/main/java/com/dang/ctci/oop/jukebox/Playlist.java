package com.dang.ctci.oop.jukebox;

import java.util.LinkedList;
import java.util.Queue;

public class Playlist {
  
  private String name;
  private Song currentSong;
  Queue<Song> songs = new LinkedList<>();
  
  public Song getNextSongToPlay() {
    return songs.peek();
  }
  
  public void addSong(Song song) {
    songs.add(song);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Song getCurrentSong() {
    return currentSong;
  }

  public void setCurrentSong(Song currentSong) {
    this.currentSong = currentSong;
  }
}
