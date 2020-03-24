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

    public long countByExample(ItemsExample example) {
        return 0;
    }

    public int deleteByExample(ItemsExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(Items record) {
        return 0;
    }

    public int insertSelective(Items record) {
        return 0;
    }

    public List<Items> selectByExample(ItemsExample example) {
        return null;
    }

    public Items selectByPrimaryKey(Integer id) {
        return null;
    }

    public int updateByExampleSelective(Items record, ItemsExample example) {
        return 0;
    }

    public int updateByExample(Items record, ItemsExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(Items record) {
        return 0;
    }

    public int updateByPrimaryKey(Items record) {
        return 0;
    }
}
