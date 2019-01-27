package com.nanofaroque.tictactoe.controllers;

import com.google.gson.Gson;
import com.nanofaroque.tictactoe.exceptions.EntityNotFoundException;
import com.nanofaroque.tictactoe.exceptions.ParameterNotFoundException;
import com.nanofaroque.tictactoe.exceptions.RequestBodyNotFoundException;
import com.nanofaroque.tictactoe.request_body.AddGameRequestBody;
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
    public Game game(@RequestBody String body) throws RequestBodyNotFoundException {
        if (body == null) throw new RequestBodyNotFoundException(GameController.class, "Request body is missing");
        Gson gson = new Gson();
        AddGameRequestBody addGameRequestBody = gson.fromJson(body, AddGameRequestBody.class);
        List<Player> players = new ArrayList<>();
        players.addAll(addGameRequestBody.getPlayers());
        return gameService.createGame(players);
    }

    @RequestMapping(path = "/api/v1/games/{gameId}", method = RequestMethod.GET)
    public Game getGame(@PathVariable("gameId") String gameId) throws ParameterNotFoundException {
        if (gameId == null)
            throw new ParameterNotFoundException(GameController.class, "Request path variable is missing");
        return gameService.getGame(UUID.fromString(gameId));
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
