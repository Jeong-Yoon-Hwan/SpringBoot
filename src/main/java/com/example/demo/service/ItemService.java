package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Item;

@Service
public class ItemService {
  
  public Item getItemById(Long id){
    Item item = new Item();
    item.setId(id);
    item.setName("Sample Item");
    item.setPrice(10.99);
    return item;
  }
}
