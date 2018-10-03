package com.greenfoxacademy.redditclone.services;

import com.greenfoxacademy.redditclone.models.Post;
import com.greenfoxacademy.redditclone.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {

  PostRepository postRepository;

  @Autowired
  public MainServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public List<Post> getAllPosts() {
    return postRepository.findAll();
  }

  @Override
  public void savePost(Post post) {
   postRepository.save(post);
  }

  @Override
  public void increaseRankById(long id) {
    Post post = postRepository.findById(id).get();
    post.changeRank(1);
    postRepository.save(post);
  }

  @Override
  public void decreaseRankById(long id) {
    Post post = postRepository.findById(id).get();
    post.changeRank(-1);
    postRepository.save(post);
  }
}