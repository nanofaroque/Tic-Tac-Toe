package com.nanofaroque.tictactoe.response_model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class HeartBeat {
    @Getter
    @Setter
    private int statusCode;
    @Getter
    @Setter
    private String message;
}
