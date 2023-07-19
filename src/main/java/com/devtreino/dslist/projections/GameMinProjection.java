package com.devtreino.dslist.projections;

public interface GameMinProjection {
    
    Long getId();
    String getTitle();
    Integer getGameYear();
    String getShortDescription();
    String getImgUrl();
    Integer getPosition();
}
