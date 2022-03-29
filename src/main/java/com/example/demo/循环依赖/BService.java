package com.example.demo.循环依赖;

import com.example.demo.循环依赖.AService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 姚飞虎
 * @Date: 2022/3/28 11:40 上午
 * @Description:
 */
@Service
public class BService {

    @Autowired
    private CService cService;

}
