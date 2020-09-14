package com.joaogcm.sdspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joaogcm.sdspesquisa.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {
	
}