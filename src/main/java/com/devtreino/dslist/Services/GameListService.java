package com.devtreino.dslist.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devtreino.dslist.dto.GameListDto;
import com.devtreino.dslist.entities.GameList;
import com.devtreino.dslist.repositories.GameListRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public GameListDto findById(Long id){
        return new GameListDto(gameListRepository.findById(id).get());
    }

    @Transactional(readOnly = true)
    public List<GameListDto> findAll(){
        List<GameList> gameList = gameListRepository.findAll();
        List<GameListDto> gameListDtos = gameList.stream().map(l -> new GameListDto(l)).toList();
        return gameListDtos;
    }
    
}
