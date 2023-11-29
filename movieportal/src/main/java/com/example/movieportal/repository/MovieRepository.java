package com.example.movieportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movieportal.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
