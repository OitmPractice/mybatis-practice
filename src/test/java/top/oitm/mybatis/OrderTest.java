package top.oitm.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.oitm.mybatis.domain.Orders;
import top.oitm.mybatis.domain.OrdersExt;
import top.oitm.mybatis.mapper.OrderMapper;

/**
 * @Description:
 * @Author: song_shu_ran
 * @Date: 2019-04-23 09:30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void findOrder(){
        OrdersExt orderById = orderMapper.findOrderById(3);
        System.out.println(orderById);
    }


    @Test
    public void findOrder2(){
        Orders orderById2 = orderMapper.findOrderById2(3);
        System.out.println(orderById2.getUser().getUsername());
        System.out.println(orderById2.getUser().getAddress());
        System.out.println(orderById2.getUser_id());
    }



}
