package com.joaogcm.sdspesquisa.entities.enums;

public enum Platform {
	PC(1, "PC"),
	PLAYSTATION(2, "Playstation"),
	XBOX(3, "Xbox");
	
	private Integer status;
	private String description;
	
	private Platform() {
		
	}
	
	private Platform(Integer status, String description) {
		this.status = status;
		this.description = description;
	}
	
	public Integer getStatus() {
		return status;
	}
	
	public String getDescription() {
		return description;
	}
	
	public static Platform status(Integer codigo) {
		if (codigo == null) {
			return null;
		}
		
		for (Platform plat : Platform.values()) {
			if (codigo.equals(plat.getStatus())) {
				return plat;
			}
		}
		throw new IllegalArgumentException("Código inválido. Id: " + codigo);
	}
}