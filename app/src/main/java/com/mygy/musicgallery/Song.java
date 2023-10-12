package com.mygy.musicgallery;

import java.io.Serializable;

public class Song implements Serializable {
    private String name;
    private String author;
    private Album album;

    public Song(String name, String author, Album album) {
        this.name = name;
        this.author = author;
        this.album = album;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Album getAlbum() {
        return album;
    }
}
