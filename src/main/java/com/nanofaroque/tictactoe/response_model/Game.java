package com.nanofaroque.tictactoe.response_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
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
    @SerializedName("gameId")
    @Expose
    private UUID gameId;

    @Getter
    @Setter
    @SerializedName("players")
    @Expose
    List<Player> players;
}
