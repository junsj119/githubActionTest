package com.hanghae.G.ATest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping("/")
    public String version() {
        return "zxzxzxzxzxzxzxqweqweqwe";
    }

}
