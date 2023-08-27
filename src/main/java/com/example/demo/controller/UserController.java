package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

  @PostMapping("/users")
  public String insertUser(@RequestBody User user){
    userService.insertUser(user);
    return "success";
  }

  @PutMapping("/users/{id}")
  public String updateUser(@PathVariable Long id, @RequestBody User user){
    userService.updateuser(id, user.getPassword());
    return "success";
  }


}
