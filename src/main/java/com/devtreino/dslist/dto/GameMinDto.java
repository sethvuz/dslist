package com.devtreino.dslist.dto;

import com.devtreino.dslist.entities.Game;
import com.devtreino.dslist.projections.GameMinProjection;

public class GameMinDto {

    private long id;
    private String title;
    private Integer year;
    private String imgUrl;  
    private String shortDescription;
    
    public GameMinDto(){

    }
    public GameMinDto(Game game) {
        this.id = game.getId();
        this.title = game.getTitle();
        this.year = game.getYear();
        this.imgUrl = game.getImgUrl();
        this.shortDescription = game.getShortDescription();
    }

    public GameMinDto (GameMinProjection projection){
        this.id = projection.getId();
        this.title = projection.getTitle();
        this.year = projection.getGameYear();
        this.imgUrl = projection.getImgUrl();
        this.shortDescription = projection.getShortDescription();
    }

    public long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public Integer getYear() {
        return year;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public String getShortDescription() {
        return shortDescription;
    }

}
