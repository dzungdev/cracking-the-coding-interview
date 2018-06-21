package com.dang.ctci.ch7.jukebox;

import java.util.ArrayList;
import java.util.List;

public class CD {
  
  List<Playlist> playlists = new ArrayList<>();
  
  public void addPlayList(Playlist playList) {
    playlists.add(playList);
  }
  
}