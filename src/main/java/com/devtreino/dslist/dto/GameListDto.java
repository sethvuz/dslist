package com.devtreino.dslist.dto;

import com.devtreino.dslist.entities.GameList;

public class GameListDto {
    
    private Long id;
    private String name;

    public GameListDto(){

    }

    public GameListDto(GameList gameList){
        this.id = gameList.getId();
        this.name = gameList.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
        
}
