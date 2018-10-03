package com.greenfoxacademy.peertopeerchat.services;

import com.greenfoxacademy.peertopeerchat.models.User;

public interface MainService {
  void saveUser(User user);

  User findUserById(String id);
}
