package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("controller")
public class controller {


    @GetMapping("/all")
    public String deneme2(){
        return "tahir tolu 65";
    }
}