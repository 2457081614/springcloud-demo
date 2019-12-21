package com.yl.springcloudlogin.controller;

import com.yl.springcloudlogin.entity.request.UserRegisterReq;
import com.yl.springcloudlogin.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @Author 向往啊 2457081614@qq.com
 * @Date 2019/07/18 23:33
 * @Version 1.0
 * @package com.yl.springcloudlogin.controller
 */
@Slf4j
@RestController
@RequestMapping(value = "/user")
@Api("用户相关接口")
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * 登录接口
     *
     * @param account
     * @param password
     * @return
     */
    @ApiOperation("用户登录接口")
    @RequestMapping(value = "/login", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String login(@RequestParam("account") String account, @RequestParam("password") String password) {


        return "login sucess";
    }


    @ApiOperation("用户注册接口")
    @RequestMapping(value = "/register", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String register(@RequestBody UserRegisterReq userRegisterReq) {
        userService.registerUser(userRegisterReq);
        return "注册成功";
    }


}
