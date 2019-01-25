package com.nanofaroque.tictactoe.service;

import com.nanofaroque.tictactoe.data_source.Helper;
import com.nanofaroque.tictactoe.response_model.Game;
import com.nanofaroque.tictactoe.response_model.Player;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class GameService implements IGameService {

    @Override
    public Game createGame(List<Player> players) {
        Game game=new Game();
        game.setGameId(UUID.randomUUID());
        game.setPlayers(players);
        return Helper.addGame(game);
    }

    @Override
    public List<Game> allGames() {
        return Helper.getAllGames();
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
