package com.example.springwork1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springwork1.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, String> {

}
