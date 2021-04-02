package com.manage.drug.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杉子
 * @date 2021/4/2 19:43
 */
@RestController
@RequestMapping("/test")
public class ControllerTest {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
