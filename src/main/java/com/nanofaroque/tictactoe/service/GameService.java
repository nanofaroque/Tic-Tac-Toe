package com.nanofaroque.tictactoe.service;

import com.nanofaroque.tictactoe.data_source.Helper;
import com.nanofaroque.tictactoe.exceptions.EntityNotFoundException;
import com.nanofaroque.tictactoe.response_model.Game;
import com.nanofaroque.tictactoe.response_model.Player;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class GameService implements IGameService {

    @Override
    public Game createGame(List<Player> players) {
        Game game = new Game();
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
        for (Game g : Helper.games) {
            if (g.getGameId() == id) return g;
        }
        return null;
    }

    @Override
    public Game updateGame(UUID id, List<Player> players) {
        return null;
    }

    @Override
    public boolean deleteGame(UUID id) throws EntityNotFoundException {
        boolean isDeleted = false;
        for (Game g : Helper.games) {
            if (g.getGameId() == id) {
                Helper.games.remove(g);
                isDeleted = true;
                break;
            }
        }
        if (!isDeleted) throw new EntityNotFoundException(GameService.class, "game not found");
        return isDeleted;
    }

    @Override
    public Game partialUpdate() {
        return null;
    }
}
