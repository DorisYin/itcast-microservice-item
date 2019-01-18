package cn.itcast.microservice.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by DorisYin on 2019/1/18.
 */
@Data
@AllArgsConstructor
public class Item {
    private long id;
    private String title;
    private String pic;
    private String desc;
    private Long price;
}
