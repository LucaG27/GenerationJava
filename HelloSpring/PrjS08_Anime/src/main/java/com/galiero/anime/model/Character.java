package com.galiero.anime.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="character")
public class Character {
	
	@Id
	private String characterName;
	private String animeIn;
	private String voiceActorFname;
	private String voiceActorLname;
	
	
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	public String getAnimeIn() {
		return animeIn;
	}
	public void setAnimeIn(String animeIn) {
		this.animeIn = animeIn;
	}
	public String getVoiceActorFname() {
		return voiceActorFname;
	}
	public void setVoiceActorFname(String voiceActorFname) {
		this.voiceActorFname = voiceActorFname;
	}
	public String getVoiceActorLname() {
		return voiceActorLname;
	}
	public void setVoiceActorLname(String voiceActorLname) {
		this.voiceActorLname = voiceActorLname;
	}
}
