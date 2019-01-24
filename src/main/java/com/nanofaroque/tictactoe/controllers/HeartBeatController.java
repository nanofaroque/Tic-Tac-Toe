package com.nanofaroque.tictactoe.controllers;

import com.nanofaroque.tictactoe.response_model.HeartBeat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeartBeatController {
    @RequestMapping("/")
    public HeartBeat index() {
        return new HeartBeat(200,"I am alive");
    }
}
