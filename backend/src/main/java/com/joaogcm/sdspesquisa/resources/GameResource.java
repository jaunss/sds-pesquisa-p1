package com.joaogcm.sdspesquisa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaogcm.sdspesquisa.entities.dto.GameDTO;
import com.joaogcm.sdspesquisa.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameResource {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public ResponseEntity<?> findAll() {
		List<GameDTO> obj = gameService.findAll();
		return ResponseEntity.ok().body(obj);
	}
}