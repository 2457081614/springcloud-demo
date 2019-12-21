package com.yl.springcloudlogin.service.impl;

import com.yl.springcloudlogin.entity.User;
import com.yl.springcloudlogin.entity.request.UserRegisterReq;
import com.yl.springcloudlogin.repository.UserRepository;
import com.yl.springcloudlogin.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 向往啊 2457081614@qq.com
 * @Date 2019/07/21 22:50
 * @Version 1.0
 * @package com.yl.springcloudlogin.service.impl
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean registerUser(UserRegisterReq userRegisterReq) {
        User user = new User();
        BeanUtils.copyProperties(userRegisterReq, user);
        userRepository.save(user);
        return true;
    }
}
