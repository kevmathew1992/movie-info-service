/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservice.movieinfoservice.model;

/**
 *
 * @author Dell
 */
public class Movie {
    
    private String id;
    private String movieName;
    private String movieDesc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDesc() {
        return movieDesc;
    }

    public void setMovieDesc(String movieDesc) {
        this.movieDesc = movieDesc;
    }

    public Movie() {
    }

    public Movie(String id, String movieName, String movieDesc) {
        this.id = id;
        this.movieName = movieName;
        this.movieDesc = movieDesc;
    }
    
    
}
