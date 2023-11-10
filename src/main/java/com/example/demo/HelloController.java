package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping
    public String hello(){
        return "자흦ㅎㅈ헺헤즣ㅈㅎwhy Hello jenkins!!!!!!!!";
    }

}
