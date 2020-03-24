package com.demo.mapper;

import com.demo.dao.Items;
import com.demo.dao.ItemsExample;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/*
* 方法    功能说明
* int countByExample(UserExample example) thorws SQLException    按条件计数
* int deleteByPrimaryKey(Integer id) thorws SQLException    按主键删除
* int deleteByExample(UserExample example) thorws SQLException    按条件查询
* String/Integer insert(User record) thorws SQLException    插入数据（返回值为ID）
* User selectByPrimaryKey(Integer id) thorws SQLException    按主键查询
* ListselectByExample(UserExample example) thorws SQLException    按条件查询
* ListselectByExampleWithBLOGs(UserExample example) thorws SQLException    按条件查询（包括BLOB字段）。只有当数据表中的字段类型有为二进制的才会产生。
* int updateByPrimaryKey(User record) thorws SQLException    按主键更新
* int updateByPrimaryKeySelective(User record) thorws SQLException    按主键更新值不为null的字段
* int updateByExample(User record, UserExample example) thorws SQLException    按条件更新
* int updateByExampleSelective(User record, UserExample example) thorws SQLException    按条件更新值不为null的字段
* */

/*
*
* 方法    说明
* example.setOrderByClause(“字段名 ASC”);    添加升序排列条件，DESC为降序
* example.setDistinct(false)    去除重复，boolean型，true为选择不重复的记录。
* criteria.andXxxIsNull    添加字段xxx为null的条件
* criteria.andXxxIsNotNull    添加字段xxx不为null的条件
* criteria.andXxxEqualTo(value)    添加xxx字段等于value条件
* criteria.andXxxNotEqualTo(value)    添加xxx字段不等于value条件
* criteria.andXxxGreaterThan(value)    添加xxx字段大于value条件
* criteria.andXxxGreaterThanOrEqualTo(value)    添加xxx字段大于等于value条件
* criteria.andXxxLessThan(value)    添加xxx字段小于value条件
* criteria.andXxxLessThanOrEqualTo(value)    添加xxx字段小于等于value条件
* criteria.andXxxIn(List<？>)    添加xxx字段值在List<？>条件
* criteria.andXxxNotIn(List<？>)    添加xxx字段值不在List<？>条件
* criteria.andXxxLike(“%”+value+”%”)    添加xxx字段值为value的模糊查询条件
* criteria.andXxxNotLike(“%”+value+”%”)    添加xxx字段值不为value的模糊查询条件
* criteria.andXxxBetween(value1,value2)    添加xxx字段值在value1和value2之间条件
* criteria.andXxxNotBetween(value1,value2)    添加xxx字段值不在value1和value2之间条件
* */

public class ItemsMapperTest {
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    ItemsMapper itemsMapper = ac.getBean(ItemsMapper.class);

    @Test
    public void countByExample() {
        // select count(*) from items
        ItemsExample example = new ItemsExample();
        long count = itemsMapper.countByExample(example);
        System.out.println(count);
    }

    @Test
    public void deleteByExample() {
    }

    @Test
    public void deleteByPrimaryKey() {
        // delete from items where id=8
        itemsMapper.deleteByPrimaryKey(8);
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByExample() {
        // select * from items
        ItemsExample example = new ItemsExample();
        List<Items> itemsList = itemsMapper.selectByExample(example);
        for (Items items : itemsList){
            System.out.println(items);
        }
    }

    @Test
    public void selectByPrimaryKey() {
        // select * from items where id = 1
        Items items = itemsMapper.selectByPrimaryKey(1);
        System.out.println(items);
    }

    @Test
    public void updateByExampleSelective() {
    }

    @Test
    public void updateByExample() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
        // update items set name='黑马310更新' where id=2
        Items items = new Items();
        items.setId(2);
        items.setName("黑马310更新");
        itemsMapper.updateByPrimaryKey(items);
    }
}