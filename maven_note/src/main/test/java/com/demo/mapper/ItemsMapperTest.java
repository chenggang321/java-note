package com.demo.mapper;

import com.demo.dao.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class ItemsMapperTest {

    @Test
    public void findItemById() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsMapper itemsMapper = ac.getBean(ItemsMapper.class);

        Items items = itemsMapper.findItemById(1);
        System.out.println(items);
    }
}