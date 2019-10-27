package MusicCatalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Songster implements Iterable<Song> {

    private List<Song> songs = new ArrayList<>();
    private String name;

    public Songster(String name, Song ... songs) {
        this.name = name;
        this.songs.addAll(Arrays.asList(songs));
    }

    public String getName() { return name; }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    public List<Song> findSongs(Predicate<Song> songPredicate) {
        return Tools.findByPredicate(songs, songPredicate);
    }
    
    @Override
    public Iterator<Song> iterator() {
        return songs.iterator();
    }
}
