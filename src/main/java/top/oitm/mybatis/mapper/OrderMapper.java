package top.oitm.mybatis.mapper;

import top.oitm.mybatis.domain.Orders;
import top.oitm.mybatis.domain.OrdersExt;

import java.util.List;

/**
 * @Description:
 * @Author: song_shu_ran
 * @Date: 2019-04-23 09:12
 */

public interface OrderMapper {

    OrdersExt findOrderById(int id);

    Orders findOrderById2(int id);


    Orders findOrderById3(int id);

    /**
     * 懒加载定单的用户数据
     *
     * @return
     */
    List<Orders> findOrderAndUserByLazyloading();

}
