package com.example.demo.循环依赖;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 姚飞虎
 * @Date: 2022/3/29 3:48 下午
 * @Description:
 */
@Service
public class CService {

    @Autowired
    private AService aService;

}
