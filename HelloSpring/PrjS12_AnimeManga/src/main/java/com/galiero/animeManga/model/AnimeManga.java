package com.galiero.animeManga.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="anime_manga")
public class AnimeManga {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String title;
	private String author;
	private Date year;
	private String rating;
	private int episodes;
	private String images;
	private String trailer;
	private String link;
	private String synopsis;

	public AnimeManga() {
		super();
	}

	public AnimeManga(int id, String title, String author, Date year, String rating, int episodes, String images,
			String trailer, String link, String synopsis) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.year = year;
		this.rating = rating;
		this.episodes = episodes;
		this.images = images;
		this.trailer = trailer;
		this.link = link;
		this.synopsis = synopsis;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public int getEpisodes() {
		return episodes;
	}

	public void setEpisodes(int episodes) {
		this.episodes = episodes;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	@Override
	public String toString() {
		return "AnimeManga [id=" + id + ", title=" + title + ", author=" + author + ", year=" + year + ", rating="
				+ rating + ", episodes=" + episodes + ", images=" + images + ", trailer=" + trailer + ", link=" + link
				+ ", synopsis=" + synopsis + "]";
	}


}
