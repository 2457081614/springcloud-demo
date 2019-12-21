package com.yl.springcloudlogin.entity.request;

import lombok.Data;
import lombok.ToString;

/**
 * @Author 向往啊 2457081614@qq.com
 * @Date 2019/07/21 22:51
 * @Version 1.0
 * @package com.yl.springcloudlogin.entity.request
 */
@Data
@ToString
public class UserRegisterReq {

    private String name;

    private String account;

    private String password;
}
