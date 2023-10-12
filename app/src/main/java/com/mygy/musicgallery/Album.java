package com.mygy.musicgallery;

import java.io.Serializable;

public class Album implements Serializable {
    private String name;
    private int iconRes;
    private String author;
    private int year;
    private long listens;
    private Song[] songs;

    public Album(String name, int iconRes, String author, int year, long listens) {
        this.name = name;
        this.iconRes = iconRes;
        this.author = author;
        this.year = year;
        this.listens = listens;
        this.songs=new Song[0];
    }

    public void setSongs(Song[] songs) {
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public int getIconRes() {
        return iconRes;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public long getListens() {
        return listens;
    }

    public Song[] getSongs() {
        return songs;
    }
}
