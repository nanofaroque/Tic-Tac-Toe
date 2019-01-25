package com.nanofaroque.tictactoe.data_source;

import com.nanofaroque.tictactoe.response_model.Game;
import java.util.ArrayList;
import java.util.List;

public class Helper {
    public static List<Game> games=new ArrayList<>();
    public static List<Game> getAllGames(){
        return games;
    }

    public static Game addGame(Game game) {
        games.add(game);
        return game;
    }
}
