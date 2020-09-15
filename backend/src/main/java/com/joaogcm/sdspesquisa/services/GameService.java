package com.joaogcm.sdspesquisa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joaogcm.sdspesquisa.entities.Game;
import com.joaogcm.sdspesquisa.entities.dto.GameDTO;
import com.joaogcm.sdspesquisa.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameDTO> findAll() {
		List<Game> obj = gameRepository.findAll();
		return obj.stream().map(x -> new GameDTO(x)).collect(Collectors.toList());
	}
}