package com.greenfoxacademy.redditclone.controllers;

import com.greenfoxacademy.redditclone.models.Post;
import com.greenfoxacademy.redditclone.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  MainService mainService;

  @Autowired
  public MainController(MainService mainService) {
    this.mainService = mainService;
  }

  @GetMapping("/show")
  public String getMainPage(Model model) {
    model.addAttribute("posts", mainService.getAllPosts());
    return "index";
  }

  @GetMapping("/submit")
  public String getSubmitPage(Model model) {
    model.addAttribute("post", new Post());
    return "postCreater";
  }

  @PostMapping("/submit")
  public String createPost(@ModelAttribute Post post) {
    mainService.savePost(post);
    return "redirect:/show";
  }

  @GetMapping("/increase/{id}")
  public String increaseRank(@PathVariable(value = "id") long id) {
    mainService.increaseRankById(id);
    return "redirect:/show";
  }

  @GetMapping("/decrease/{id}")
  public String decreaseRank(@PathVariable(value = "id") long id) {
    mainService.decreaseRankById(id);
    return "redirect:/show";
  }
}
