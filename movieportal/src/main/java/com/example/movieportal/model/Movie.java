package com.example.movieportal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Movie { // POJO class -> Plain Old Java Object

	@Id
	private Integer movieId;
	private String name;
	private String hero;
	private String director;
	private String production;
	private String certificate;
	private String language;
	private String year;
	private String imdb;
	private String ott;

	public String getProduction() {
		return production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getImdb() {
		return imdb;
	}

	public void setImdb(String imdb) {
		this.imdb = imdb;
	}

	public String getOtt() {
		return ott;
	}

	public void setOtt(String ott) {
		this.ott = ott;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHero() {
		return hero;
	}

	public void setHero(String hero) {
		this.hero = hero;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}
