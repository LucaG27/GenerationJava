package com.galiero.anime.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="episode")
public class Episode {
	
	private String animeName;
	@Id
	private int episodeNumber;
	
	private String episodeTitle;
	private String episodeDescription;
	
	
	public String getAnimeName() {
		return animeName;
	}
	public void setAnimeName(String animeName) {
		this.animeName = animeName;
	}
	public int getEpisodeNumber() {
		return episodeNumber;
	}
	public void setEpisodeNumber(int episodeNumber) {
		this.episodeNumber = episodeNumber;
	}
	public String getEpisodeTitle() {
		return episodeTitle;
	}
	public void setEpisodeTitle(String episodeTitle) {
		this.episodeTitle = episodeTitle;
	}
	public String getEpisodeDescription() {
		return episodeDescription;
	}
	public void setEpisodeDescription(String episodeDescription) {
		this.episodeDescription = episodeDescription;
	}
	
	

}
