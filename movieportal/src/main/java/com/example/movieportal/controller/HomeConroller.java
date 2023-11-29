package com.example.movieportal.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.movieportal.model.Movie;
import com.example.movieportal.service.MovieService;

@Controller
public class HomeConroller {

	@Autowired
	private MovieService movieService;

	@GetMapping("/view")
	public String ViewPage(Model model) {
		model.addAttribute("allMovies", movieService.showAllMovies());
		return "view";
	}

	@GetMapping("/add")
	public String addPage(Model model) {
		model.addAttribute("obj", new Movie());
		return "add";
	}

	@PostMapping("/add")
	public String addData(@ModelAttribute("obj") Movie movie) {
		Optional<Movie> opt = movieService.searchMovie(movie.getMovieId());
		if (opt.isEmpty()) {
			movieService.addNewMovie(movie);
			return "redirect:/view";
		} else {
			return "redirect:/add?failed";
		}
	}
	
	@GetMapping("/edit/{id}")
	public String editPage(@PathVariable("id") int movie_id, Model model)
	{
		
		model.addAttribute("obj", movieService.searchMovie(movie_id));
		return "edit";
	}
	
	@PostMapping("/edit")
	public String editMovie(@ModelAttribute("obj")Movie movie)
	{
		movieService.addNewMovie(movie);
		return "redirect:/view";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteMovie(@PathVariable("id") int movieId)
	{
		movieService.deleteMovie(movieId);
		return "redirect:/view";
	}
}
