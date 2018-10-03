package com.greenfoxacademy.peertopeerchat.services;

import com.greenfoxacademy.peertopeerchat.models.User;
import com.greenfoxacademy.peertopeerchat.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService{

  UserRepository userRepository;

  @Autowired
  public MainServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }


  @Override
  public void saveUser(User user) {
    userRepository.save(user);
  }
}