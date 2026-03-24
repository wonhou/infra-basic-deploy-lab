package com.example.deploylab.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.deploylab.entity.Item;
import com.example.deploylab.repository.ItemRepository;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    // 전체 조회
    @GetMapping
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    // 등록
    @PostMapping
    public Item save(@RequestParam String name) {
        return itemRepository.save(new Item(name));
    }
}