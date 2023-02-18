package com.example.springbootdemo.module.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/demo/test")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @PostMapping("/servlet")
    public String servletTest(HttpServletRequest request) {
        System.out.println(request.getRequestURI());
        System.out.println(request.getParameter("name"));
        return "success";
    }
}
