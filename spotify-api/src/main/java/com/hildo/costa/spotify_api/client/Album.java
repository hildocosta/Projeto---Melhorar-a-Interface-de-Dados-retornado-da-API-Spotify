package com.hildo.costa.spotify_api.client;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;


@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Album {

    private String id;
    private String name;
    private String releaseDate;
    private List<Artist> artists;
    private List<Image> images;
    private int totalTracks;

    public Album() {
    }

    public Album(String id, List<Image> images, List<Artist> artists, String releaseDate, String name, int totalTracks) {
        this.id = id;
        this.images = images;
        this.artists = artists;
        this.releaseDate = releaseDate;
        this.name = name;
        this.totalTracks = totalTracks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalTracks() {
        return totalTracks;
    }

    public void setTotalTracks(int totalTracks) {
        this.totalTracks = totalTracks;
    }
}