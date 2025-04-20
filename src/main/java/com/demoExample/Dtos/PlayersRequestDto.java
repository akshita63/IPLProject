package com.demoExample.Dtos;



//this is my pojo class assuming  my frontend sends this data with the same logic
public class PlayersRequestDto {
	
	private int playerid;
	private String playerName;
	private String playerTeam;
	public int getPlayerid() {
		return playerid;
	}
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerTeam() {
		return playerTeam;
	}
	public void setPlayerTeam(String playerTeam) {
		this.playerTeam = playerTeam;
	}
	public PlayersRequestDto(int playerid, String playerName, String playerTeam) {
		super();
		this.playerid = playerid;
		this.playerName = playerName;
		this.playerTeam = playerTeam;
	}
	public PlayersRequestDto() {
	}
	}
	


