package com.nanofaroque.tictactoe.data_source;

import com.nanofaroque.tictactoe.response_model.Game;
import com.nanofaroque.tictactoe.response_model.Player;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Helper {
    static List<Game> games=new ArrayList<>();
    public static List<Game> getAllGames(){
        Game g1=new Game();
        g1.setGameId(UUID.randomUUID());

        Player p1=new Player();
        p1.setId(UUID.randomUUID());
        p1.setName("Omar");

        Player p2=new Player();
        p2.setId(UUID.randomUUID());
        p2.setName("Omar");
        List<Player> players=new ArrayList<>();
        players.add(p1);
        players.add(p2);
        g1.setPlayers(players);
        games.add(g1);
        return games;
    }

    public static Game addGame(List<Player> players) {
        Game game=new Game();
        game.setGameId(UUID.randomUUID());
        game.setPlayers(players);
        games.add(game);
        return game;
    }
}
