package com.xworkz.crud.dto;

public class IPLDto extends AbstractAuditDto {
	private String teamName;
	private String captainName;
	private boolean ownerAlive;
	private String coach;
	private int wins;
	private int defeats;
	
	public IPLDto() {
		System.out.println("calling no argument constructor of IPLDto");
	}

	@Override
	public String toString() {
		return "IPLDto [teamName=" + teamName + ", captainName=" + captainName + ", ownerAlive=" + ownerAlive
				+ ", coach=" + coach + ", wins=" + wins + ", defeats=" + defeats + "]";
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCaptainName() {
		return captainName;
	}

	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

	public boolean isOwnerAlive() {
		return ownerAlive;
	}

	public void setOwnerAlive(boolean ownerAlive) {
		this.ownerAlive = ownerAlive;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getDefeats() {
		return defeats;
	}

	public void setDefeats(int defeats) {
		this.defeats = defeats;
	}
	
	
	
	

}
