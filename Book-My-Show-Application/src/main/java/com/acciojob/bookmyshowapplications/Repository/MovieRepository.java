package com.acciojob.bookmyshowapplications.Repository;

import com.acciojob.bookmyshowapplications.Enums.Genre;
import com.acciojob.bookmyshowapplications.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Integer> {

    Movie findMovieByMovieName(String movieName);

    @Query(value = "select * from movies where movie_name = :movieName", nativeQuery = true)
    Movie findMovie(String movieName);


    @Query(value = "select * from movies where genre = :g",nativeQuery = true)
    List<Movie> findByGenre(Genre g);
}
