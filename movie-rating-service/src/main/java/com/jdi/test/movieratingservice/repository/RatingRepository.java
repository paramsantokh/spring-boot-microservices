package com.jdi.test.movieratingservice.repository;

import com.jdi.test.movieratingservice.model.Rating;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends CrudRepository<Rating, String> {
  
  public List<Rating> findRatingByUserId(String userId);
}
