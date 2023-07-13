package com.devtreino.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devtreino.dslist.Services.GameListService;
import com.devtreino.dslist.dto.GameListDto;
import com.devtreino.dslist.entities.GameList;

@RestController
@RequestMapping(value = "/list")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping("/{id}")
    public GameListDto findById(@PathVariable Long id){
        return gameListService.findById(id);
    }

    @GetMapping("/all")
    public List<GameListDto> findAll(){
        return gameListService.findAll();
    }    
}
