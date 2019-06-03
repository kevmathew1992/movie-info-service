/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservice.movieinfoservice.controller;

import com.microservice.movieinfoservice.model.Movie;
import static java.lang.System.out;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Dell
 */

@RestController
@RequestMapping("/movies")
public class MovieInfoController {
    
    @GetMapping("/fetchMovieInfo/{movieId}")
    public Movie fetchMovieInfo(@PathVariable("movieId") String movieId) {
        
        List<Movie> movies = Arrays.asList(
                new Movie("1", "Inception", "Dream Movie"),
                new Movie("2", "Avengers - Infinity War", "Everyone Dissapears"),
                new Movie("2", "Avengers - Endgame", "Everyone Reappears")
        );
        
//        Movie responseMovie = movies.stream().map(movie -> {
//            
//            return new Movie();
//        });
        System.out.println("fetchMovieInfo movieId "+movieId);
        return new Movie();
    }
    
}
