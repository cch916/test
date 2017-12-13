package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class test {

    @RequestMapping("/a")
    public Map test(){
        Map map=new HashMap();
        map.put("status","1");
        map.put("test","测试");
        return map;
    }


}
