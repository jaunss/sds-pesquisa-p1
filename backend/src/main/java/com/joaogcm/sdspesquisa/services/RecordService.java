package com.joaogcm.sdspesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joaogcm.sdspesquisa.dto.RecordDTO;
import com.joaogcm.sdspesquisa.entities.Game;
import com.joaogcm.sdspesquisa.entities.Record;
import com.joaogcm.sdspesquisa.entities.dto.RecordInsertDTO;
import com.joaogcm.sdspesquisa.repositories.GameRepository;
import com.joaogcm.sdspesquisa.repositories.RecordRepository;

@Service
public class RecordService {
	
	@Autowired
	private RecordRepository recordRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO objDTO) {
		Record obj = new Record();
		
		obj.setName(objDTO.getName());
		obj.setAge(objDTO.getAge());
		obj.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(objDTO.getGameId());
		obj.setGame(game);
		
		obj = recordRepository.save(obj);
		
		return new RecordDTO(obj);
	}
	
	@Transactional(readOnly = true)
	public Page<RecordDTO> findByMoments(Instant minDate, Instant maxDate, PageRequest pageRequest) {
		return recordRepository.findByMoments(minDate, maxDate, pageRequest).map(x -> new RecordDTO(x));
	}
}