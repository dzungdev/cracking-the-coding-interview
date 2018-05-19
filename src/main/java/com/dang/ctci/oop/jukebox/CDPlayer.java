package com.dang.ctci.oop.jukebox;

public class CDPlayer {
  
  private CD cd;
  private Playlist playlist;
  
  public CDPlayer(CD cd) {
    this.cd = cd;
  }
  
  public CD getCd() {
    return cd;
  }

  public void setCd(CD cd) {
    this.cd = cd;
  }

  public Playlist getPlaylist() {
    return playlist;
  }

  public void setPlaylist(Playlist playlist) {
    this.playlist = playlist;
  }
  
}
