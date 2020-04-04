package com.demo.cg.mapper;

import com.demo.cg.pojo.Items;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemsMapperTest {
    @Autowired
    private ItemsMapper itemsMapper;

    @Test
    public void testQuery(){
        Items items = itemsMapper.selectByPrimaryKey(1);
        System.out.println(items.toString());
    }
}