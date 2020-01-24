package com.jdi.test.springbootms.model;

public class MovieCatalog {
  private String userId;
  private String movieId;
  private String name;
  private String genre;
  private String desc;
  private int rating;
  
  public MovieCatalog(String userId, String movieId, String name, String genre, String desc, int rating) {
    this.userId = userId;
    this.movieId = movieId;
    this.name = name;
    this.genre = genre;
    this.desc = desc;
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
  
  public String getDesc() {
    return desc;
  }
  
  public void setDesc(String desc) {
    this.desc = desc;
  }
  
  public int getRating() {
    return rating;
  }
  
  public void setRating(int rating) {
    this.rating = rating;
  }
  
  @Override
  public String toString() {
    return "MovieCatalog{" +
           "id='" + movieId + '\'' +
           ", name='" + name + '\'' +
           ", genre='" + genre + '\'' +
           ", desc='" + desc + '\'' +
           ", rating='" + rating + '\'' +
           '}';
  }
}
