package consumer.service;


import com.example.demo.domain.UserAddress;
import com.example.demo.service.OrderService;
import com.example.demo.service.UserService;

import java.util.List;

/**
 *
 * @author admin
 * @create 2020/6/9
 * @since 1.0.0
 */
public class OrderServiceImpl implements OrderService {

    private UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        return userService.queryUserAddressAll(userId);
    }

    /**
     * set注入
     * @param userService
     */
    public void setUserService(UserService userService) {
        this.userService=userService;
    }
}
