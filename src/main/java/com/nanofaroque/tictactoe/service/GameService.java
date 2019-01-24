package com.nanofaroque.tictactoe.service;

import com.nanofaroque.tictactoe.response_model.Game;
import com.nanofaroque.tictactoe.response_model.Player;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class GameService implements IGameService {

    @Override
    public Game createGame(List<Player> players) {
        return null;
    }

    @Override
    public List<Game> allGames() {
        Game g = new Game();
        g.setId(UUID.randomUUID());
        List<Game> games = new ArrayList<>();
        games.add(g);
        return games;
    }

    @Override
    public Game getGame(UUID id) {
        return null;
    }

    @Override
    public Game updateGame(UUID id, List<Player> players) {
        return null;
    }

    @Override
    public Game deleteGame(UUID id) {
        return null;
    }

    @Override
    public Game partialUpdate() {
        return null;
    }
}
