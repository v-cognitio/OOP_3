package MusicCatalog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Artist implements Iterable<Album> {
    private String name;
    private List<Album> albums = new ArrayList<>();

    public Artist(String name, Album ... albums) {
        this.name = name;
        for (Album album : albums) {
            this.addAlbum(album);
        }
    }

    public String getName() { return name; }

    public void addAlbum(Album album) {
        if (album.getArtist() != null && album.getArtist() != this) {
            throw new IllegalArgumentException("Wrong artist: " + album.getArtist().name +
                    " expected " + this.name);
        }
        albums.add(album);
    }

    @Override
    public Iterator<Album> iterator() { return albums.iterator(); }
}
