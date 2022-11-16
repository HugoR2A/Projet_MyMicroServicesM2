package com.example.demo.model;


import java.util.List;

public class Film {

    private String title;
    private String directorName;
    private String mainActor;
    private String releaseDate;
    private List<String> filmography;

    public Film(String title, String directorName, String mainActor, String releaseDate, List<String> filmography) {
        this.title = title;
        this.directorName = directorName;
        this.mainActor = mainActor;
        this.releaseDate = releaseDate;
        this.filmography = filmography;
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

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
