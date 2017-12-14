package com.test.controller;

import com.test.model.user;
import com.test.service.testService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class test {
    @Resource
    private testService testService;
    @RequestMapping("/test")
    public Map test() {
        Map map=new HashMap();
        map.put("status","0");
        List<user> list=new ArrayList();
        try {
            list = testService.getList();
            map.put("list",list);
            map.put("status","1");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }


}



