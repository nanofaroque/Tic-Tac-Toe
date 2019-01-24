package com.nanofaroque.tictactoe.response_model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
public class Game {
    @Getter
    @Setter
    public UUID id;

    @Getter
    @Setter
    List<Player> players;
}
