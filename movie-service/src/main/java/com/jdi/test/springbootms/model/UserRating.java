package com.jdi.test.springbootms.model;

import java.util.Arrays;
import java.util.List;

public class UserRating {
  
  private List<Rating> ratings;
  
  public List<Rating> getRatings() {
    return ratings;
  }
  
  public void setRatings(List<Rating> ratings) {
    this.ratings = ratings;
  }
  
  @Override
  public String toString() {
    return "UserRating{" +
           "ratings=" + ratings +
           '}';
  }
}
