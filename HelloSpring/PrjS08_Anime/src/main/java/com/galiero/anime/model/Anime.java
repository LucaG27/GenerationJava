package com.galiero.anime.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="anime")
public class Anime {
	
	@Id

	private String animeName;
	private String director;
	private String studio;
	private String writer;
	private Date startDate;
	private Date endDate;
	private String episodes;
	
	private String relatedManga;
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getStudio() {
		return studio;
	}
	public void setStudio(String studio) {
		this.studio = studio;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getEpisodes() {
		return episodes;
	}
	public void setEpisodes(String episodes) {
		this.episodes = episodes;
	}
	public String getRelatedManga() {
		return relatedManga;
	}
	public void setRelatedManga(String relatedManga) {
		this.relatedManga = relatedManga;
	}

}
