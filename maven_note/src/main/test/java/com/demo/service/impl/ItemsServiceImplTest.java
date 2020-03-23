package com.demo.service.impl;
import com.demo.dao.Items;
import com.demo.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ItemsServiceImplTest {

    @Test
    public void findItemById() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService itemsService = ac.getBean(ItemsService.class);

        Items items = itemsService.findItemById(1);
        System.out.println(items);
    }
}