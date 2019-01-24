package com.nanofaroque.tictactoe.controllers;

import com.google.gson.Gson;
import com.nanofaroque.tictactoe.response_model.Game;
import com.nanofaroque.tictactoe.response_model.Player;
import com.nanofaroque.tictactoe.service.IGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class GameController {
    @Autowired
    IGameService gameService;
    @Autowired
    Gson gson;

    /**
     * Return all the games
     *
     * @return List<Game> list
     */
    @RequestMapping(path = "/api/v1/games", method = RequestMethod.GET)
    public List<Game> getAllGames() {
        return gameService.allGames();
    }

    @RequestMapping(path = "/api/v1/games", method = RequestMethod.POST)
    public Game game() {
        return gameService.createGame(null);
    }

    @RequestMapping(path = "/api/v1/games/:gameId", method = RequestMethod.PUT)
    public Game updateGame(@PathVariable("gameId") UUID gameId,
                           @RequestBody String players) {
        List<Player> p = new ArrayList<>();
        return gameService.updateGame(gameId, p);

    }

    @RequestMapping(path = "/api/v1/games/{gameId}", method = RequestMethod.DELETE)
    public Game deleteGame(@PathVariable("gameId") UUID gameId) {
        return gameService.deleteGame(gameId);
    }

    @RequestMapping(path = "/api/v1/games/:gameId", method = RequestMethod.PATCH)
    public Game partialUpdateGame() {
        return gameService.partialUpdate();


    }
}
