package com.example.springwork1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springwork1.entity.Item;
import com.example.springwork1.service.ItemService;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/item")
    public ResponseEntity<List<Item>> getItemList() {
        List<Item> itemList = itemService.getItemList();
        return ResponseEntity.status(200).body(itemList);
    }

    @PostMapping("/item")
    public ResponseEntity<String> saveItem(@RequestBody Item item) {

        if (item.getItemCode() == null || item.getItemCode() == "") {
            return ResponseEntity.status(422).body("Please enter a valid code");
        }

        itemService.saveItem(item);

        return ResponseEntity.status(201).body("item added successfully");
    }

    @GetMapping("/item/{itemCode}")
    public ResponseEntity<Item> getItemByCode(@PathVariable String itemCode) {
        Item item = itemService.getItemByCode(itemCode);

        if (item == null) {
            return ResponseEntity.status(404).body(null);
        } else {
            return ResponseEntity.status(200).body(item);
        }
    }

    @PutMapping("/item/{itemCode}")
    public ResponseEntity<Item> updateItem(@PathVariable String itemCode, @RequestBody Item item) {
        Item updatedItem = itemService.updateItem(itemCode, item);

        if (updatedItem == null) {
            return ResponseEntity.status(404).body(null);
        } else {
            return ResponseEntity.status(200).body(updatedItem);
        }
    }

    @DeleteMapping("/item/{itemCode}")
    public void deleteItem(@PathVariable String itemCode) {
        itemService.deleteItem(itemCode);
    }
}
