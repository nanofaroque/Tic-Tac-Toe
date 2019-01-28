package com.nanofaroque.tictactoe.service;

import com.nanofaroque.tictactoe.exceptions.EntityNotFoundException;
import com.nanofaroque.tictactoe.response_model.Game;
import com.nanofaroque.tictactoe.response_model.Player;

import java.util.List;
import java.util.UUID;

public interface IGameService {
    /**
     * Create Game
     *
     * @param players List of {@link Player}
     */
    Game createGame(List<Player> players);

    /**
     * Get all games
     *
     * @return List of {@link Game}
     */
    List<Game> allGames();

    /**
     * Get individual game details
     *
     * @param id Game Id
     * @return {@link Game}
     */
    Game getGame(UUID id);

    /**
     * Update Game
     *
     * @param id      Game ID
     * @param players List of {@link Player}
     */
    Game updateGame(UUID id, List<Player> players);

    /**
     * Delete Game
     *
     * @param id Game ID
     * @return deleted game or not
     */
    boolean deleteGame(UUID id) throws EntityNotFoundException;

    Game partialUpdate();
}
