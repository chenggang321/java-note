package com.demo.cg.web;

import com.demo.cg.pojo.Items;
import com.demo.cg.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @GetMapping("{id}")
    public Items getItemsById(@PathVariable("id") Long id){
        return itemsService.queryById(id);
    }
}
