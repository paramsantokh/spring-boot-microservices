package com.jdi.test.springbootms.controller;

import com.jdi.test.springbootms.model.Movie;
import com.jdi.test.springbootms.model.MovieCatalog;
import com.jdi.test.springbootms.model.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/movie-catalog")
@EnableEurekaClient
public class MovieCatalogResource {
  
  @Autowired
  private RestTemplate restTemplate;
  
  @GetMapping ("/{userId}")
  public List<MovieCatalog> getMovieCatalog(@PathVariable String userId) {
    List<MovieCatalog> movieCatalogs = new ArrayList<>();
    UserRating userRating = restTemplate.getForObject("http://movie-rating-service/ratings/users/" + userId, UserRating.class);
   
    userRating.getRatings().forEach(rating -> {
      Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
      movieCatalogs.add(new MovieCatalog(userId, movie.getMovieId(), movie.getName(), movie.getGenre(), movie.getDescription(), rating.getRating()));
    });
    
    return movieCatalogs;
  }
  
  @GetMapping
  public List<MovieCatalog> getMovieCatalog() {
    List<MovieCatalog> movieCatalogs = new ArrayList<>();
    UserRating userRating = restTemplate.getForObject("http://movie-rating-service/ratings/", UserRating.class);
    userRating.getRatings().forEach(rating -> {
      Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
      movieCatalogs.add(new MovieCatalog(rating.getUserId(), movie.getMovieId(), movie.getName(), movie.getGenre(), movie.getDescription(), rating.getRating()));
    });
    
    return movieCatalogs;
  }
  
}
