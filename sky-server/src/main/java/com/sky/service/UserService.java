package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;

/**
 * @Author: gs_wang
 * @Date: 2024/07/17/下午8:21
 * @Description:
 */
public interface UserService {

    User wxLogin(UserLoginDTO userLoginDTO);

}
