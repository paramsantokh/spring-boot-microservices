package com.jdi.test.movieinfoservice.service;

import com.jdi.test.movieinfoservice.model.Movie;
import com.jdi.test.movieinfoservice.repository.MovieInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
  
  @Autowired
  MovieInfoRepository movieInfoRepository;
  
  public List<Movie> getMovies(){
    return movieInfoRepository.findAll();
  }
  
  public Movie getMovie(String movieId){
    Optional<Movie> movie = movieInfoRepository.findById(movieId);
    return movie.orElse(null);
  }
  
  public void addMovie(Movie movie){
    movieInfoRepository.save(movie);
  }
  
  public void deleteMovie(@PathVariable String movieId){
    movieInfoRepository.deleteById(movieId);
  }
}
