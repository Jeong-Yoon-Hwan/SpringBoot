package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;

@Service
public class UserService {
  private final UserMapper userMapper;

  @Autowired
  public UserService(UserMapper userMapper){
    this.userMapper = userMapper;
  }
 
  public List<User> getAllUsers(){
    return userMapper.getAllUsers();
  }

  public User getUserById(Long id) {
    return userMapper.getUserById(id);
  } 

}
