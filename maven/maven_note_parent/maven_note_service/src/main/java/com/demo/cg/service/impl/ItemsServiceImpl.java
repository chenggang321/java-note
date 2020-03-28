package com.demo.cg.service.impl;

import com.demo.cg.mapper.ItemsMapper;
import com.demo.cg.pojo.Items;
import com.demo.cg.pojo.ItemsExample;
import com.demo.cg.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public List<Items> findItemsList() {
        ItemsExample example = new ItemsExample();
        return itemsMapper.selectByExample(example);
    }
}
