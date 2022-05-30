package com.galiero.anime.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "manga")
public class Manga {
	
	@Id
	private String mangaName;
	private Date startDate;
	private Date endDate;
	private String numOfVolumes;
	
	
	public String getMangaName() {
		return mangaName;
	}
	public void setMangaName(String mangaName) {
		this.mangaName = mangaName;
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
	public String getNumOfVolumes() {
		return numOfVolumes;
	}
	public void setNumOfVolumes(String numOfVolumes) {
		this.numOfVolumes = numOfVolumes;
	}
	
	
	


}
