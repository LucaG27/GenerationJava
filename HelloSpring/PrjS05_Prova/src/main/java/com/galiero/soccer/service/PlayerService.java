package com.galiero.soccer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galiero.soccer.model.Player;
import com.galiero.soccer.repository.Database;

@Service
public class PlayerService {

	@Autowired
	Database db;

	public List<Player> getAllPlayers() {
		return db.getAll();
	}

	public Player getPlayer(int id) {
		return db.getPlayer(id);
	}
	
	public void addPlayer(Player player) {
		db.addPlayer(player);
	}

	public void updatePlayer(int id, Player player) {
		db.updatePlayer(id, player);
	}
		
	public void deletePlayer(int id) {
		db.deletePlayer(id);
	}
}
