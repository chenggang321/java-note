package com.demo.cg.controller;

import com.demo.cg.pojo.Items;
import com.demo.cg.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Items> getItemsList(){
        return itemsService.findItemsList();
    }
}
