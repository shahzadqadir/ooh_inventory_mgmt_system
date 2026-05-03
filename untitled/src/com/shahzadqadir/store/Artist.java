package com.shahzadqadir.store;

public class Artist {
    private String name;
    private String[] memberNames;
    private String[] memberInstruments;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Artist(String name) {
        setName(name);
    }
}
