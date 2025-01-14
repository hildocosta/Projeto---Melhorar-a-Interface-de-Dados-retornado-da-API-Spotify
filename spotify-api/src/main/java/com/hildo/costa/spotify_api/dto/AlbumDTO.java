package com.hildo.costa.spotify_api.dto;

public class AlbumDTO {
    private String albumName;
    private String artist;
    private String imageUrl;
    private String releaseDate;
    private int trackCount;

    public AlbumDTO() {
    }

    public AlbumDTO(String albumName, String artist, String imageUrl, String releaseDate, int trackCount) {
        this.albumName = albumName;
        this.artist = artist;
        this.imageUrl = imageUrl;
        this.releaseDate = releaseDate;
        this.trackCount = trackCount;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }
}
