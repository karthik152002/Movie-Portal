package com.example.movieportal.service;

import java.util.List;
import java.util.Optional;

import com.example.movieportal.model.Movie;

public interface MovieService {

	List<Movie> showAllMovies();
	
	Optional<Movie> searchMovie (int id);
	
	Movie addNewMovie(Movie movie);
	
	void deleteMovie(int id);
	
}
