package com.joaogcm.sdspesquisa.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaogcm.sdspesquisa.dto.RecordDTO;
import com.joaogcm.sdspesquisa.entities.dto.RecordInsertDTO;
import com.joaogcm.sdspesquisa.services.RecordService;

@RestController
@RequestMapping(value = "/records")
public class RecordResource {
	
	@Autowired
	private RecordService recordService;
	
	@PostMapping
	public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO recordDTO) {
		RecordDTO newDTO = recordService.insert(recordDTO);
		return ResponseEntity.ok().body(newDTO);
	}
}
	