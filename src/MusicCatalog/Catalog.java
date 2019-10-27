package MusicCatalog;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Catalog {
    private List<Artist> artists = new ArrayList<>();
    private List<Songster> songsters = new ArrayList<>();

    public void addArtist(Artist artist) { artists.add(artist); }
    public void addSongster(Songster songster) { songsters.add(songster); }

    public List<Song> findSongs(Predicate<Artist> artistPredicate,
                                Predicate<Album>  albumPredicate,
                                Predicate<Song>   songPredicate) {

        return findAlbums(artistPredicate, albumPredicate).stream()
                .map(album -> Tools.findByPredicate(album, songPredicate))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public List<Album> findAlbums(Predicate<Artist> artistPredicate,
                                  Predicate<Album>  albumPredicate) {

        return findArtists(artistPredicate).stream()
                .map(artist -> Tools.findByPredicate(artist, albumPredicate))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

    }

    public List<Artist> findArtists(Predicate<Artist> artistPredicate) {
        return Tools.findByPredicate(artists, artistPredicate);
    }

    public List<Songster> findSongsters(Predicate<Songster> songsterPredicate) {
        return Tools.findByPredicate(songsters, songsterPredicate);
    }

}
