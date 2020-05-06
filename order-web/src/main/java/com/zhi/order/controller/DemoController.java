package com.zhi.order.controller;

import com.zhi.order.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private UserService userService;

    @GetMapping("test")
    public String test() {
        return this.userService.test();
    }
}
