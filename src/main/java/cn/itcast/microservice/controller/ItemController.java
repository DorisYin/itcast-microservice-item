package cn.itcast.microservice.controller;

import cn.itcast.microservice.pojo.Item;
import cn.itcast.microservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DorisYin on 2019/1/19.
 */
@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping(value = "item/{id}")
    public Item queryItemById(@PathVariable("id") Long id){
        return this.itemService.queryItemById(id);
    }
}
