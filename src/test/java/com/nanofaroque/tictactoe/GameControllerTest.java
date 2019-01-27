package com.nanofaroque.tictactoe;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.google.gson.Gson;
import com.nanofaroque.tictactoe.request_body.AddGameRequestBody;
import com.nanofaroque.tictactoe.response_model.Game;
import com.nanofaroque.tictactoe.response_model.Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GameControllerTest {
    @Autowired
    private MockMvc mvc;
    @Autowired
    Gson gson;

    @Test
    public void allGameTest() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/api/v1/games").
                accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void createGameTest() throws Exception {
        AddGameRequestBody body = new AddGameRequestBody();
        List<Player> players = new ArrayList<>();
        players.add(new Player("Omar", UUID.fromString("b088ce8e-ca41-43af-81a9-21460ff01e1f")));
        players.add(new Player("Faroque", UUID.fromString("d3209d42-5ad0-46fe-a935-4007bf79b6f7")));
        body.setPlayers(players);

        mvc.perform(MockMvcRequestBuilders.post("/api/v1/games")
                .content(gson.toJson(body))
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void createGameTestNullBody() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/api/v1/games")
                .content("")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void getGameTest() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/api/v1/games/{gameId}" ,"")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}
