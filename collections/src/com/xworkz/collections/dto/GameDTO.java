package com.xworkz.collections.dto;

public class GameDTO {
	
	private String name;
	private String type;
	private int noOfPlayers;
	
	public GameDTO() {
		// TODO Auto-generated constructor stub
	}

	public GameDTO(String name, String type, int noOfPlayers) {
		this.name = name;
		this.type = type;
		this.noOfPlayers = noOfPlayers;
	}

	@Override
	public String toString() {
		return "GameDTO [name=" + name + ", type=" + type + ", noOfPlayers=" + noOfPlayers + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	
	@Override
	public boolean equals(Object play) {
		if(play!=null) {
			if(play instanceof GameDTO) {
				GameDTO casted=(GameDTO)play;
				if(this.name.equals(casted.name)) {
					System.out.println("property is equal");
					return true;
				}
			}
	}
		
		return false;
	}

}
