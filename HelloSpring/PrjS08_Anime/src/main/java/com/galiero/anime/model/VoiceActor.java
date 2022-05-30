package com.galiero.anime.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="voice_actor")
public class VoiceActor {
	
    @Id 
	private String voiceActorFname;
	private String voiceActorLname;
	private String voiceActorSex;
	private Date voiceActorBirthday;
	
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
	public String getVoiceActorSex() {
		return voiceActorSex;
	}
	public void setVoiceActorSex(String voiceActorSex) {
		this.voiceActorSex = voiceActorSex;
	}
	public Date getVoiceActorBirthday() {
		return voiceActorBirthday;
	}
	public void setVoiceActorBirthday(Date voiceActorBirthday) {
		this.voiceActorBirthday = voiceActorBirthday;
	}
	
}
