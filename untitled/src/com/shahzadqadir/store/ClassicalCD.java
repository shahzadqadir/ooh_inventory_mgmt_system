package com.shahzadqadir.store;

import java.util.Date;

public class ClassicalCD extends  Item{
    private String composer;
    private String[] performers = new String[5];
    private String recordingLocation;
    private Date releaseDate;
    private int performerCount;

    public ClassicalCD(String title, double price, int quantity) {
        super(title, price, quantity);
        performerCount = 0;
    }

    public int getPerformerCount() {
        return performerCount;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getRecordingLocation() {
        return recordingLocation;
    }

    public void setRecordingLocation(String recordingLocation) {
        this.recordingLocation = recordingLocation;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void addPerformer(String performer) {
        if (performerCount >= performers.length) {
            System.out.println("Performer count: " + performerCount);
            System.out.println("Array length: " + performers.length);
            System.out.println("Max number of performers has reached, can't add more performers.");
            return;
        }
        performers[performerCount++] = performer;
    }

    public void showPerformers() {
        for (String performer: performers) {
            if (performer != null)
                System.out.println(performer);
        }
    }
}
