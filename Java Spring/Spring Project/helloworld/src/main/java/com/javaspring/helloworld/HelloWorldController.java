package com.javaspring.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorldController {

    @RequestMapping("/zgogo")
    public String zgogo(){
        return "ay 7aja";
    }
}