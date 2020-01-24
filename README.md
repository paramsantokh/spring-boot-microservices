# spring-boot-microservices

#This application consists of 4 microservices communicating togather.

1. Discovery service(Eureka) register other three microservice as discovery client.
2. Movie-info-service provide movie details like movie id, name ,desc etc,
3. movie-rating-service provide rating data based on users: like this user has given this movie this many ratings.
4. movie-service is service which  use the above 2 service to provide complete movie  details based on a user.