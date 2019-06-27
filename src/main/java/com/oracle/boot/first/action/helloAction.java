package com.oracle.boot.first.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloAction {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "Hello World!";
    }
}
