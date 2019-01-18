package cn.itcast.microservice.service;

import cn.itcast.microservice.pojo.Item;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DorisYin on 2019/1/18.
 */
@Service
public class ItemService {
    private static final Map<Long,Item> MAP=new HashMap<Long, Item>();
    static {
        MAP.put(1L,new Item(1L,"商品标题1","http://图片1","商品描述1",1000L));
        MAP.put(1L,new Item(2L,"商品标题2","http://图片2","商品描述2",2000L));
        MAP.put(1L,new Item(3L,"商品标题3","http://图片3","商品描述3",3000L));
        MAP.put(1L,new Item(4L,"商品标题4","http://图片4","商品描述4",4000L));
        MAP.put(1L,new Item(5L,"商品标题5","http://图片5","商品描述5",5000L));
    }

    public Item queryItemById(Long id){
        return MAP.get(id);
    }
}
