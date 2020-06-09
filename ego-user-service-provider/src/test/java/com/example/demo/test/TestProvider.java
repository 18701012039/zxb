package com.example.demo.test;/**
 * @author zxb
 * @date 2018/10/19
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author admin
 * @create 2020/6/9
 * @since 1.0.0
 */
public class TestProvider {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("提供者启用成功");
        System.in.read();

    }
}
