package com.greenfoxacademy.peertopeerchat.repositories;

import com.greenfoxacademy.peertopeerchat.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
