package com.example.demo.bean的生命周期;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 姚飞虎
 * @Date: 2022/3/29 2:22 下午
 * @Description:
 */
public class SpringBeanCycleTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean-Lifecycle.xml");
        Book book = (Book)context.getBean("book");
        System.out.println("Book name = " + book.getBookName());
        ((ClassPathXmlApplicationContext) context).destroy();
    }
}
