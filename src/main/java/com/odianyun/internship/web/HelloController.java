package com.odianyun.internship.web;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: EDZ
 * @time: 9:44
 * @date: 2021/7/13
 */
@RestController()
@RequestMapping("hello")
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "hello world 123";
    }

    @PostMapping("hello1")
    public String hello1() {
        return "hello world 12345645";
    }
}
