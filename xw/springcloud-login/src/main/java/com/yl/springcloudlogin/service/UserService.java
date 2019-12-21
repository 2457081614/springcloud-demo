package com.yl.springcloudlogin.service;

import com.yl.springcloudlogin.entity.request.UserRegisterReq;

/**
 * @Author 向往啊 2457081614@qq.com
 * @Date 2019/07/21 22:49
 * @Version 1.0
 * @package com.yl.springcloudlogin.service
 */
public interface UserService {

    public boolean registerUser(UserRegisterReq userRegisterReq);
}
