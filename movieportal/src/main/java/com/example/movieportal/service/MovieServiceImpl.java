package com.example.movieportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movieportal.model.Movie;
import com.example.movieportal.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepo;

	@Override
	public List<Movie> showAllMovies() {

		return movieRepo.findAll();
	}

	@Override
	public Optional<Movie> searchMovie(int id) {
		
		return movieRepo.findById(id);
	}

	@Override
	public Movie addNewMovie(Movie movie) {
		
		return movieRepo.save(movie);
	}

	@Override
	public void deleteMovie(int id) {
		movieRepo.deleteById(id);
		
	}

}
