package com.galiero.soccer.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.galiero.soccer.model.Player;
import com.galiero.soccer.service.PlayerService;

@RestController
public class PlayerCtrl {
	@Autowired
	PlayerService ps;
	
	@GetMapping("/players")
	public List<Player> getAll(Model m){
		return ps.getAllPlayers();
	}
	
	@GetMapping("/players/{id}")
	public Player getPlayer(@PathVariable int id) {
		return ps.getPlayer(id);
	}
	
	@PostMapping("/players")
	public void addPlayer(@RequestBody Player player) {
		ps.addPlayer(player);
	}
	
	@PutMapping("/players/{id}")
	public void updatePlayer(@PathVariable int id, @RequestBody Player player) {
		ps.updatePlayer(id, player);
	}
	
	@DeleteMapping("/players/{id}")
	public void deletePlayer(@PathVariable int id) {
		ps.deletePlayer(id);
	}
}
