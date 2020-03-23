package com.demo.service.impl;

import com.demo.dao.Items;
import com.demo.mapper.ItemsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsMapper {
    @Autowired
    private ItemsMapper itemsMapper;

    public Items findItemById(Integer id) {
        return itemsMapper.findItemById(id);
    }
}
