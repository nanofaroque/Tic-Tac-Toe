package com.nanofaroque.tictactoe.response_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@AllArgsConstructor
public class Player {
    @SerializedName("name")
    @Expose
    @Getter
    @Setter
    private String name;
    @SerializedName("id")
    @Expose
    @Getter
    @Setter
    private UUID id;
}
