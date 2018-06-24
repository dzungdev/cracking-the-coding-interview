package com.dang.ctci.ch7.chatserver;

import java.util.List;

public abstract class Conversation {
  
  protected Long id;
  protected List<User> partitipants;
  protected List<Message> messages;
  
}
