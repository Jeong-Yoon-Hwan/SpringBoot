package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
  
  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
      this.userService = userService;
  }

  @GetMapping("/users")
  public List<User> getAllUsers(){
    return userService.getAllUsers();
  }

  @GetMapping("/users/{id}")
  public User getUser(@PathVariable Long id){
    return userService.getUserById(id);
  }

}
