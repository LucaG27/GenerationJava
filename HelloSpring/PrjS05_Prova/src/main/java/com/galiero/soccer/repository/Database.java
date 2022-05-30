package com.galiero.soccer.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.galiero.soccer.model.Player;

@Repository
public class Database {
	
	List<Player> players;
	
	public Database() {
		
		players= new ArrayList(
				Arrays.asList( new Player(1,"Francesco","Totti","Roma"),
								new Player(2,"Paolo","Maldini","Milan"),
								new Player(3,"David","Trezeguet","Juventus"),
								new Player(4,"Francesco","Acquilani","Fiorentina"),
								new Player(5,"Ciro","Immobile","Lazio")
						));
	}
	
	public List<Player> getAll(){
		return players;
	}
	
	public Player getPlayer(int id) {

		return players.stream()
							.filter(s -> s.getId() == id)
							.findFirst()
							.get();
	}
	
	public void addPlayer(Player player) {
		players.add(player);
	}


	public void updatePlayer(int id, Player player) {
		for (int i = 0; i < players.size(); i++) {
			Player p = players.get(i);
			if (p.getId() == id) {
				players.set(i, player);
			}
		}
	}

	public void deletePlayer(int id) {
		players.removeIf(p -> p.getId() == id);
	}
}
