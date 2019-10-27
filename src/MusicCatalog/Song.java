package MusicCatalog;

import MusicCatalog.Genres.Genre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Song {
    private String name;
    private Artist artist;
    private List<Genre> genres = new ArrayList<>();
    private int year;

    public Song(String name, Artist artist, int year, Genre ... genres) {
        this.name = name;
        this.artist = artist;
        this.year = year;
        this.genres.addAll(Arrays.asList(genres));
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

    public boolean containsGenre(Genre genre) {
        for (Genre g : genres) {
            if (g.isInstanceOf(genre)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() { return artist.getName() + " - " + name; }
}
