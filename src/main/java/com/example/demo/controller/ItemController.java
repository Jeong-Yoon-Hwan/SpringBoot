package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Item;
import com.example.demo.service.ItemService;

@RestController
public class ItemController {
  
  private final ItemService itemService;

  @Autowired
  public ItemController(ItemService itemService) {
      this.itemService = itemService;
  }

  @GetMapping("/items/{id}")
  public Item getItem(@PathVariable Long id) {
      return itemService.getItemById(id);
  }

}
