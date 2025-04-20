package com.demoExample.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoExample.Entity.PlayersEntity;
import com.demoExample.Repo.PlayersRepo;

@Service
public class PlayersService {
	
	
	//here I am adding dependency which comes from IOC container , spring has added the bean of playersrepo interface to the service for db interactions
	@Autowired
	private PlayersRepo playersrepo;

	public PlayersEntity savePlayers(PlayersEntity players) {
		// TODO Auto-generated method stub
		return playersrepo.save(players);
	}

	public List<PlayersEntity> getPlayers() {
		// TODO Auto-generated method stub
		return playersrepo.findAll();
	}

	

	public Optional<PlayersEntity> getPlayersById(int playerid) {
		// TODO Auto-generated method stub
		return playersrepo.findById(playerid);
	}

	public void deleteByID(int playerid) {
		// TODO Auto-generated method stub
		playersrepo.deleteById(playerid);
		
	}
	
	
	

}
