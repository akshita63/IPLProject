package com.demoExample.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Players")
public class PlayersEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int playerid;
	private String playerName;
	private String playerTeam;
	private int runs;
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
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public PlayersEntity(int playerid, String playerName, String playerTeam, int runs) {
		super();
		this.playerid = playerid;
		this.playerName = playerName;
		this.playerTeam = playerTeam;
		this.runs = runs;
	}
	
	
	public PlayersEntity() {
	}

}
