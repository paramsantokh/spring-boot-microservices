package com.jdi.test.movieratingservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass (RatingId.class)
public class Rating {
  
  @Id
  private String userId;
  @Id
  private String movieId;
  private int rating;
  
  public Rating() {
  }
  
  public Rating(String userId, String movieId, int rating) {
    this.userId = userId;
    this.movieId = movieId;
    this.rating = rating;
  }
  
  public String getUserId() {
    return userId;
  }
  
  public void setUserId(String userId) {
    this.userId = userId;
  }
  
  public String getMovieId() {
    return movieId;
  }
  
  public void setMovieId(String movieId) {
    this.movieId = movieId;
  }
  
  public int getRating() {
    return rating;
  }
  
  public void setRating(int rating) {
    this.rating = rating;
  }
  
  @Override
  public String toString() {
    return "Rating{" +
           "movieId=" + movieId +
           ", rating=" + rating +
           '}';
  }
}
