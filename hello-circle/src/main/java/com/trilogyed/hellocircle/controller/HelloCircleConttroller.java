package com.trilogyed.hellocircle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCircleConttroller {
    @GetMapping(value = "/hello")
    public String helloCircle(){
        return "Hello, Circle!";
    }

    @GetMapping(value = "/answer")
    public String helloCircleAndAnswerToLife(){
        return "The answer is 42!";
    }
}
