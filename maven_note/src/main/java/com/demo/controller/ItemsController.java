package com.demo.controller;

import com.demo.dao.Items;
import com.demo.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @RequestMapping(value = "/item")
    @ResponseBody
    public Items findDetail(){
        return null;
    }
}
