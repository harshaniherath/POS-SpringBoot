package com.example.springwork1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springwork1.dto.ItemDto;
import com.example.springwork1.entity.Item;

@Service
public interface ItemService {

    Item saveItem(ItemDto dto);

    Item updateItem(ItemDto dto);

    void deleteItem(String itemCode);

    ItemDto searchItem(String itemCode);

    List<ItemDto> loadAllItem();

}
