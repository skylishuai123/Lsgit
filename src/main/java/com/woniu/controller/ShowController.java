package com.woniu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/b")
public class ShowController {
    @RequestMapping("/c")
    public String a(){
        System.out.println(123);
        return "1";
    }
}
