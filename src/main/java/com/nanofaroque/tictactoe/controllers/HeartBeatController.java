package com.nanofaroque.tictactoe.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeartBeatController {
    @RequestMapping("/")
    public String index() {
        return "Hello from Omar";
    }
}
