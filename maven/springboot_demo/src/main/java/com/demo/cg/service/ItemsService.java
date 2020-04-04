package com.demo.cg.service;

import com.demo.cg.mapper.ItemsMapper;
import com.demo.cg.pojo.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ItemsService {
    @Autowired
    private ItemsMapper itemsMapper;

    public Items queryById(Long id){
        return itemsMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public void insertItem(Items items){
        itemsMapper.insert(items);
    }
}
