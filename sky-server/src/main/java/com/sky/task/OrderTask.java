package com.sky.task;

import com.sky.entity.Orders;
import com.sky.mapper.OrderMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author: gs_wang
 * @Date: 2024/07/26/上午10:30
 * @Description: 定时处理订单状态
 */
@Component
@Slf4j
public class OrderTask {

    @Autowired
    private OrderMapper orderMapper; // 往A注入B，前提是A已注入IOC

    // 处理超时订单
    @Scheduled(cron = "0 * * * * ?")
//    @Scheduled(cron = "1/5 * * * * ?") 测试
    public void processTimeoutOrder() {
        log.info("定时处理超时订单：{}", LocalDateTime.now());
        LocalDateTime time = LocalDateTime.now().plusMinutes(-15);
        // select * from orders where status = ? and order_time < (当前时间-15分钟)
        List<Orders> ordersList = orderMapper.getByStatusAndOrderTimeLT(Orders.PENDING_PAYMENT, time);
        if (ordersList != null && ordersList.size() > 0) {
            for (Orders order : ordersList) {
                order.setStatus(Orders.CANCELLED);
                order.setCancelReason("订单超时，自动取消");
                order.setCancelTime(LocalDateTime.now());
                orderMapper.update(order);
            }
        }

    }

    @Scheduled(cron = "0 0 1 * * ?")
//   @Scheduled(cron = "0/5 * * * * ?") 测试
    public void processDeliveryOrder() {
        log.info("定时处理处于派送中订单：{}", LocalDateTime.now());
        // select * from orders where status = ? and order_time < (当前时间-1h)
        // 因为是凌晨一点出发，当前时间是凌晨1点-1h 就是处理上一个工作日的
        LocalDateTime time = LocalDateTime.now().plusHours(-1);
        List<Orders> ordersList = orderMapper.getByStatusAndOrderTimeLT(Orders.DELIVERY_IN_PROGRESS, time);
        if (ordersList != null && ordersList.size() > 0) {
            for (Orders order : ordersList) {
                order.setStatus(Orders.COMPLETED);
                orderMapper.update(order);
            }
        }
    }

}
