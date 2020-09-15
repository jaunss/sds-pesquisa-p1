package com.joaogcm.sdspesquisa.dto;

import java.io.Serializable;
import java.time.Instant;

import com.joaogcm.sdspesquisa.entities.Record;
import com.joaogcm.sdspesquisa.entities.enums.Platform;

public class RecordDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Instant moment;
	private String name;
	private Integer age;
	private String gameTitle;
	private Platform gamePlatform;
	private String genreName;
	
	public RecordDTO() {
		
	}
	
	public RecordDTO(Record obj) {
		id = obj.getId();
		moment = obj.getMoment();
		name = obj.getName();
		age = obj.getAge();
		gameTitle = obj.getGame().getTitle();
		gamePlatform = obj.getGame().getPlatform();
		genreName = obj.getGame().getGenre().getName();
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Instant getMoment() {
		return moment;
	}
	
	public void setMoment(Instant moment) {
		this.moment = moment;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getGameTitle() {
		return gameTitle;
	}
	
	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}
	
	public Platform getGamePlatform() {
		return gamePlatform;
	}
	
	public void setGamePlatform(Platform gamePlatform) {
		this.gamePlatform = gamePlatform;
	}
	
	public String getGenreName() {
		return genreName;
	}
	
	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
}