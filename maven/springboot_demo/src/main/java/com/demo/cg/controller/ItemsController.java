package com.demo.cg.controller;

import com.demo.cg.pojo.Items;
import com.demo.cg.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("items")
@ResponseBody
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @GetMapping("{id}")
    public Items getItemById(@PathVariable("id") Long id){
        return itemsService.queryById(id);
    }
}
