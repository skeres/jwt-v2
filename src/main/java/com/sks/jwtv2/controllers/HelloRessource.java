package com.sks.jwtv2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloRessource {

    @RequestMapping("/hello")
    public String hello(){
        return "HW !";
    }
}
