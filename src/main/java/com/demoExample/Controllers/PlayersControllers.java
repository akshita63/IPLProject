package com.demoExample.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoExample.Entity.PlayersEntity;
import com.demoExample.Service.PlayersService;

@RestController
@RequestMapping("/players")
public class PlayersControllers {
	
	
	//field injection
	@Autowired
	private PlayersService playersservice;
	
	//constructore injection is more preferred
	public PlayersControllers( PlayersService playersservice) {
		this.playersservice=playersservice;
	}
	
	
	@PostMapping
	public ResponseEntity<PlayersEntity> savePlayers(@RequestBody PlayersEntity players){
		
		PlayersEntity p1=playersservice.savePlayers(players);
		
		return ResponseEntity.ok(p1);
		
		
		
	}
	
	@GetMapping
	public List<PlayersEntity> getPlayers(){
		
		//here I am creating an object of the list which holds the objects of the PlayersEntity
		List<PlayersEntity> p2=playersservice.getPlayers();
		return p2;
	}
	
	@GetMapping("/play/{playerid}")
	public ResponseEntity<PlayersEntity> getPlayersById(@PathVariable int playerid) {
		Optional<PlayersEntity> p1=playersservice.getPlayersById(playerid);
		if(p1.isPresent()) {
			return ResponseEntity.ok(p1.get());
		}
		
		else {
			return ResponseEntity.notFound().build();
		}
		
	}
		
		@DeleteMapping("/abc/{playerid}")
		public List<PlayersEntity> deleteById(@PathVariable int playerid) {
		    playersservice.deleteByID(playerid);
		    
		    
		    return playersservice.getPlayers();
		}
		
		
		
	
	
	
	
	
	


}
