package com.devtreino.dslist.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devtreino.dslist.dto.GameMinDto;
import com.devtreino.dslist.entities.Game;
import com.devtreino.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    
    public List<GameMinDto> findAll(){
        List<Game> games = gameRepository.findAll();
        List<GameMinDto> gamesDtos = games.stream().map(g -> new GameMinDto(g)).toList();    
        return gamesDtos;
    }
}
