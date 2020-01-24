package com.jdi.test.movieinfoservice.repository;

import com.jdi.test.movieinfoservice.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieInfoRepository extends JpaRepository<Movie, String> {
  
}
