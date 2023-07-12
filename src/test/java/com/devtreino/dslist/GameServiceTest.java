package com.devtreino.dslist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.devtreino.dslist.Services.GameService;
import com.devtreino.dslist.dto.GameMinDto;
import com.devtreino.dslist.repositories.GameRepository;

@SpringBootTest
public class GameServiceTest {

    @Autowired
    private GameService gameService;
    @MockBean
    private List<GameMinDto> gamesDtos;

    @MockBean
    private GameRepository gameRepository;


    // @BeforeEach()
    // public void setup(){
    //     gameService = new GameService();
    //     gamesDtos = new ArrayList<>();
    // }

    // @Test
    // public void deveRetornarArrayComDezJogos(){
    //     // gamesDtos = gameService.findAll();
    //     when(gameService.findAll()).thenReturn(gamesDtos);
    //     assertEquals(10, gamesDtos.size());

    // }
    
}
