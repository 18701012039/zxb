package com.example.demo.service;

import com.example.demo.domain.UserAddress;

import java.util.List;

/**
 * 消费者接口
 * @author zxb
 * @date 2020/06/09
 */
public interface OrderService {

    List<UserAddress> initOrder(String userId);
}
