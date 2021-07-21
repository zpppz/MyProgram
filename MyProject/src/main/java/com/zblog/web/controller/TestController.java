package com.zblog.web.controller;

import com.zblog.web.bean.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author peng.zhang11
 */
@RestController
@RequestMapping("/user")
public class TestController {


    /**
     * @param id 用户id
     * @return 用户详情
     */
    @GetMapping("/details")
    public User queryUserDetailById(@RequestParam("id") int id){
        User user=new User();

        return user;
    }
}
