package consumer;/**
 * @author zxb
 * @date 2018/10/19
 */

import com.example.demo.domain.UserAddress;
import com.example.demo.service.OrderService;
import org.springframework.boot.web.servlet.context.XmlServletWebServerApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author admin
 * @create 2020/6/9
 * @since 1.0.0
 */
public class TestConsumer {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderService orderService = (OrderService)applicationContext.getBean("orderService");
        List<UserAddress> zxb = orderService.initOrder("zxb");
        System.out.println(zxb.toString()+"消费者");
    }
}
