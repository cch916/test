package com.test.controller;

import com.test.service.testService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class test {
    @Resource
    private testService testService;
    @RequestMapping("/test")
    public List  test() {
        List<test> list=new ArrayList();
        try {
            list = testService.getList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


}



