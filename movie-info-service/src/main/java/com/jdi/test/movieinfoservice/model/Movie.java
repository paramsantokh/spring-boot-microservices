package com.jdi.test.movieinfoservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
  
  @Id
  private String movieId;
  private String name;
  private String genre;
  private String description;
  
  public Movie(){
  
  }
  
  public Movie(String movieId, String name, String genre, String description) {
    this.movieId = movieId;
    this.name = name;
    this.genre = genre;
    this.description = description;
  }
  
  public String getMovieId() {
    return movieId;
  }
  
  public void setMovieId(String movieId) {
    this.movieId = movieId;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getGenre() {
    return genre;
  }
  
  public void setGenre(String genre) {
    this.genre = genre;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  @Override
  public String toString() {
    return "Movie{" +
           "movieId='" + movieId + '\'' +
           ", name='" + name + '\'' +
           ", genre='" + genre + '\'' +
           ", description='" + description + '\'' +
           '}';
  }
}
