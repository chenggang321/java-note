package com.demo.service.impl;

import com.demo.dao.Items;
import com.demo.dao.ItemsExample;
import com.demo.mapper.ItemsMapper;
import com.demo.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsMapper itemsMapper;

    public List<Items> findItemsList() {
        ItemsExample example = new ItemsExample();
        List<Items> itemsList = itemsMapper.selectByExample(example);
        return itemsList;
    }
}
