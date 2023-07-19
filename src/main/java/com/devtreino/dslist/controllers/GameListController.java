package com.devtreino.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devtreino.dslist.Services.GameListService;
import com.devtreino.dslist.Services.GameService;
import com.devtreino.dslist.dto.GameListDto;
import com.devtreino.dslist.dto.GameMinDto;


@RestController
@RequestMapping(value = "/list")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping("/{id}")
    public GameListDto findById(@PathVariable Long id){
        return gameListService.findById(id);
    }

    @GetMapping("/{id}/games")
    public List<GameMinDto> findGamesByList(@PathVariable Long id){
        return gameService.findByList(id);
    }

    @GetMapping("/all")
    public List<GameListDto> findAll(){
        return gameListService.findAll();
    }
    
    
}
