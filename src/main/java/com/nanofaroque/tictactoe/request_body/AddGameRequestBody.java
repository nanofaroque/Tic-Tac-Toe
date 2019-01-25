package com.nanofaroque.tictactoe.request_body;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.nanofaroque.tictactoe.response_model.Player;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class AddGameRequestBody {
    @SerializedName("players")
    @Expose
    @Getter
    @Setter
    private List<Player> players = null;
}
