package com.example.demo.service;

import com.example.demo.domain.UserAddress;
import java.util.List;

/**
 * 提供者接口
 * @author zxb
 * @date 2020/06/09
 */
public interface UserService {

    /**
     * 查询用户地址
     * @param userId 用户id
     * @return 根据用户id返回查询结果
     */
    List<UserAddress> queryUserAddressAll(String userId);
    
}
