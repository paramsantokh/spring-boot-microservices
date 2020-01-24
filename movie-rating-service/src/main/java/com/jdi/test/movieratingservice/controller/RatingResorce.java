package com.jdi.test.movieratingservice.controller;

import com.jdi.test.movieratingservice.model.Rating;
import com.jdi.test.movieratingservice.model.UserRating;
import com.jdi.test.movieratingservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@RestController
@RequestMapping ("/ratings")
@EnableEurekaClient
public class RatingResorce {
  
  @Autowired
  RatingService ratingService;
  
  @GetMapping ("/users/{userId}")
  public UserRating getRating(@PathVariable String userId) {
    UserRating ratings = ratingService.getMovieRatingsByUserId(userId);
    
    return ratings;
  }
  
  @GetMapping
  public UserRating getRatings() {
    UserRating userRating = ratingService.getMovieRatings();
    return userRating;
  }
  
  @PostMapping
  public void addRating(@RequestBody Rating rating) {
    ratingService.add(rating);
  }
  
  @DeleteMapping ("/users/{userId}")
  public void deleteRating(@PathVariable String userId) {
    ratingService.delete(userId);
  }
}
