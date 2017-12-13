package com.test.service.ServiceImpl;


import com.test.dao.userMapper;
import com.test.service.testService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class testServiceImpl<user, Integer> implements testService {
    @Resource
    private userMapper userMapper;

    @Override
    public List<user> getList() throws Exception {
        return userMapper.getList();
    }
}
