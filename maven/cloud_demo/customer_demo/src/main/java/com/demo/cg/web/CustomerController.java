package com.demo.cg.web;

import com.demo.cg.pojo.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("{id}")
    public Items queryById(@PathVariable("id") Long id){
        String url = "http://localhost:9999/items/" + id;
        Items items = restTemplate.getForObject(url,Items.class);
        return items;
    }
}
