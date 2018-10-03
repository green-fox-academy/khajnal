package com.greenfoxacademy.redditclone.services;

import com.greenfoxacademy.redditclone.models.Post;

import java.util.List;

public interface MainService {
  List<Post> getAllPosts();

  void savePost(Post post);
}
