package com.devtreino.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devtreino.dslist.entities.GameList;
import com.devtreino.dslist.projections.GameMinProjection;

public interface GameListRepository extends JpaRepository<GameList, Long>{

    @Query(nativeQuery = true, value = """
        select g.id, g.title, g.game_year as gameYear, g.short_description as shortDescription, g.img_url as imgUrl, b.position
        from tb_game as g
        inner join tb_belonging as b on g.id = b.game_id
        where b.list_id = :listId
        order by b.position; """)

    List<GameMinProjection> searchByList(Long listId);
    
}
