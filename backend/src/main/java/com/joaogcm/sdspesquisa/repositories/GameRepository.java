package com.joaogcm.sdspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joaogcm.sdspesquisa.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
	
}