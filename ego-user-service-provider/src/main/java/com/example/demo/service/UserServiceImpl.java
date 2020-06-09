package com.example.demo.service;

import com.example.demo.domain.UserAddress;
import java.util.ArrayList;
import java.util.List;

/**
 * 提供者实现类
 * @author admin
 * @create 2020/6/9
 * @since 1.0.0
 */
public class UserServiceImpl implements UserService{
    public static List<UserAddress> userAddressList=new ArrayList<>();

    static{
        userAddressList.add(new UserAddress(1,"zxb","zxb"));
        userAddressList.add(new UserAddress(2,"zqq","zqq"));
    }
    @Override
    public List<UserAddress> queryUserAddressAll(String userId) {
        System.out.println("消费者调用成功");
        return userAddressList;
    }
}
