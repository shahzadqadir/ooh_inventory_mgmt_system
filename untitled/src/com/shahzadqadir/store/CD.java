package com.shahzadqadir.store;

import java.util.Date;

public class CD extends Item {
    private Artist artist;
    private Date releaseDate;

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public CD() {}

    public CD(String title, double price, int quantity, Artist artist, Date releaseDate) {
        super(title, price, quantity);
        setArtist(artist);
        setReleaseDate(releaseDate);
    }
}
