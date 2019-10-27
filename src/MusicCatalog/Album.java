package MusicCatalog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Album implements Iterable<Song> {
    private String name;
    private Artist artist;
    private int year;
    private List<Song> songs = new ArrayList<>();

    public Album(String name, Artist artist, int year, Song ... songs) {
        this.name = name;
        this.artist = artist;
        this.year = year;
        for (Song song : songs) {
            this.addSong(song);
        }
    }

    public String getName() { return name; }
    public Artist getArtist() { return artist; }
    public int getYear() { return year; }

    public void setArtist(Artist artist) {
        if (this.artist != null) {
            throw new IllegalAccessError("Artist already exists");
        }
        this.artist = artist;
    }

    public void addSong(Song song) {
        if (song.getArtist() != null && song.getArtist() != this.artist) {
            throw new IllegalArgumentException("Wrong artist: " + song.getArtist().getName() +
                    " expected " + this.name);
        }
        songs.add(song);
    }

    @Override
    public Iterator<Song> iterator() { return songs.iterator(); }
}
