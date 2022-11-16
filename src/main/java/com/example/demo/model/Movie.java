package com.example.demo.model;


public class Movie {

    private String title;
    private String directorName;
    private String releaseDate;
    public static Actor mainActor;

    public Movie(String title, String directorName, Actor mainActor, String releaseDate) {
        this.title = title;
        this.directorName = directorName;
        Movie.mainActor = mainActor;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDirectorName() {
        return directorName;
    }
    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }
    public String getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
