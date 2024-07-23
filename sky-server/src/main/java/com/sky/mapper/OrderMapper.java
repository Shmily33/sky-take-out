package com.sky.mapper;

import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: gs_wang
 * @Date: 2024/07/23/下午2:20
 * @Description:
 */
@Mapper
public interface OrderMapper {

    void insert(Orders orders);
}
