package com.jdi.test.movieratingservice.service;

import com.jdi.test.movieratingservice.model.UserRating;
import com.jdi.test.movieratingservice.repository.RatingRepository;
import com.jdi.test.movieratingservice.model.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RatingService {
  
  @Autowired
  RatingRepository ratingRepository;
  
  public UserRating getMovieRatings() {
    List<Rating> ratings = (List<Rating>) ratingRepository.findAll();
    UserRating userRating = new UserRating();
    userRating.setRatings(ratings);
    return userRating;
  }
  
  public UserRating getMovieRatingsByUserId(String userId) {
    List<Rating> ratings = ratingRepository.findRatingByUserId(userId);
    UserRating userRating = new UserRating();
    userRating.setRatings(ratings);
    return userRating;
  }
  
  public void add(Rating rating) {
    ratingRepository.save(rating);
  }
  
  public void delete(String userId) {
    ratingRepository.deleteById(userId);
  }
}
