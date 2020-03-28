package com.demo.cg.service.impl;

import com.demo.cg.pojo.Items;
import com.demo.cg.service.ItemsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring/applicationContext-*.xml")
public class ItemsServiceImplTest {

    @Autowired
    private ItemsService itemsService;

    @Test
    public void findItemsList() {
        List<Items> itemsList = itemsService.findItemsList();
        for (Items items : itemsList){
            System.out.println(items);
        }
    }
}