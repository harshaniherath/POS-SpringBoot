package com.example.springwork1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springwork1.entity.Item;
import com.example.springwork1.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> getItemList() {
        return itemRepository.findAll();
    }

    @Override
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item getItemByCode(String itemCode) {
        return itemRepository.findById(itemCode).orElse(null);
    }

    @Override
    public Item updateItem(String itemCode, Item item) {
        Item existingItem = itemRepository.findById(itemCode).orElse(null);

        if (existingItem == null) {
            return null;
        } else {
            existingItem.setDescription(item.getDescription());
            existingItem.setQty(item.getQty());
            existingItem.setUnitPrice(item.getUnitPrice());

            return itemRepository.save(existingItem);
        }
    }

    @Override
    public void deleteItem(String itemCode) {
        itemRepository.deleteById(itemCode);
    }
}
