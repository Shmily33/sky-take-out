package com.sky.service.impl;

import com.sky.dto.DishDTO;
import com.sky.entity.Dish;
import com.sky.entity.DishFlavor;
import com.sky.mapper.DishFlavorMapper;
import com.sky.mapper.DishMapper;
import com.sky.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: gs_wang
 * @Date: 2024/07/10/下午2:55
 * @Description:
 */
@Service
@Slf4j
public class DishServiceImpl implements DishService {

    @Autowired
    private DishMapper dishMapper;

    @Autowired
    private DishFlavorMapper dishFlavorMapper;

    @Transactional
    @Override
    public void saveWithFlavor(DishDTO dishDTO) { // 两张表操作，保持数据一致性
        Dish dish = new Dish();
        BeanUtils.copyProperties(dishDTO, dish);
        // 菜品表插入1条数据
        dishMapper.insert(dish);

        // 获取insert语句生成的主键值
        // useGeneratedKeys="true" keyProperty="id" 使用产生的主键赋值为id
        Long dishId = dish.getId();

        // 口味表插入n条数据
        List<DishFlavor> flavors = dishDTO.getFlavors();
        if (flavors != null && flavors.size() > 0) { // 不空且有数据存在
            flavors.forEach(f -> {
                f.setDishId(dishId);
            });
            dishFlavorMapper.insertBatch(flavors); // 传入对象批量插入

        }
    }
}
