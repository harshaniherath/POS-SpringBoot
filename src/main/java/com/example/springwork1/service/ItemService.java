package com.example.springwork1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springwork1.entity.Item;

@Service
public interface ItemService {

    List<Item> getItemList();

    Item saveItem(Item item);

    Item getItemByCode(String itemCode);

    Item updateItem(String itemCode, Item item);

    void deleteItem(String itemCode);

}
