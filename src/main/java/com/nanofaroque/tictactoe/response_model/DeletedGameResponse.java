package com.nanofaroque.tictactoe.response_model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Data
@AllArgsConstructor
public class DeletedGameResponse {
    @Getter
    @Setter
    String message;
    @Getter
    @Setter
    UUID gameId;
}
