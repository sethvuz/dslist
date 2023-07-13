package com.devtreino.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devtreino.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}
