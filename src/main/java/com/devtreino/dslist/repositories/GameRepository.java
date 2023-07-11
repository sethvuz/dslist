package com.devtreino.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devtreino.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
