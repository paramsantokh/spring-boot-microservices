package com.jdi.test.movieinfoservice.controller;

import com.jdi.test.movieinfoservice.model.Movie;
import com.jdi.test.movieinfoservice.repository.MovieInfoRepository;
import com.jdi.test.movieinfoservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
@EnableEurekaClient
public class MovieResource {
  
  @Autowired
  MovieService movieService;
  
  @RequestMapping("/{movieId}")
  public Movie getMovie(@PathVariable String movieId){
     return movieService.getMovie(movieId);
  }
  
  @RequestMapping
  public List<Movie> getMovies(){
    return movieService.getMovies();
  }
  
  @DeleteMapping("/{movieId}")
  public void delete(@PathVariable String movieId){
    movieService.deleteMovie(movieId);
  }
  
  @PostMapping
  public void addMovie(@RequestBody Movie movie){
    movieService.addMovie(movie);
  }
}
