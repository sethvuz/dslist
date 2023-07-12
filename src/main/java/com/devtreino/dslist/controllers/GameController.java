package com.devtreino.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devtreino.dslist.Services.GameService;
import com.devtreino.dslist.dto.GameMinDto;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDto> findAll(){
        return gameService.findAll();
    }

    // @RequestMapping(value = "/games")
    // public String teste(){
    //     return "Olá! Estou testando o Spring Boot!";
    // }

    // @RequestMapping(value = "/games2")
    // public String teste2(){
    //     return "Outro teste para o SB!";
    // }

}
