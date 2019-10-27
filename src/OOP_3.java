import MusicCatalog.Album;
import MusicCatalog.Artist;
import MusicCatalog.Catalog;
import MusicCatalog.Song;
import MusicCatalog.Genres.*;

import java.util.List;


public class OOP_3 {

    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        Artist Slowdive = new Artist("Slowdive");
        Artist EnterShikari = new Artist("Enter Shikari");
        Artist MyChemicalRomance = new Artist("My Chemical Romance");

        Album Souvlaki = new Album("Souvlaki", Slowdive, 1993);
        Slowdive.addAlbum(Souvlaki);

        Album TakeToTheSkies = new Album("Take to the Skies", EnterShikari, 2007);
        EnterShikari.addAlbum(TakeToTheSkies);

        Album ThreeCheersForSweetRevenge = new Album("Three Cheers for Sweet Revenge",
                MyChemicalRomance, 2004);
        MyChemicalRomance.addAlbum(ThreeCheersForSweetRevenge);

        Song WhenTheSunHits = new Song("When the Sun Hits", Slowdive, 1993, Shoegaze.getInstance());
        Souvlaki.addSong(WhenTheSunHits);
        Song HereSheComes = new Song("Here She Comes", Slowdive, 1993, Shoegaze.getInstance());
        Souvlaki.addSong(HereSheComes);

        Song SorryYoureNotAWinner = new Song("Sorry You're Not a Winner", EnterShikari, 2003,
                PostHardcore.getInstance());
        TakeToTheSkies.addSong(SorryYoureNotAWinner);
        Song Labyrinth = new Song("Labyrinth", EnterShikari, 2005, PostHardcore.getInstance());
        TakeToTheSkies.addSong(Labyrinth);

        Song ImNotOk = new Song("I’m Not Okay (I Promise)", MyChemicalRomance, 2004, Punk.getInstance());
        ThreeCheersForSweetRevenge.addSong(ImNotOk);
        Song TheGhostOfYou = new Song("The Ghost of You", MyChemicalRomance, 2005,
                AlternativeRock.getInstance());
        ThreeCheersForSweetRevenge.addSong(TheGhostOfYou);

        catalog.addArtist(Slowdive);
        catalog.addArtist(EnterShikari);
        catalog.addArtist(MyChemicalRomance);

        List<Song> res = catalog.findSongs(artist -> true,
                                           album  -> true,
                                           song   -> song.containsGenre(AlternativeRock.getInstance()));
        for (Song song : res) {
            System.out.println(song);
        }
        System.out.println();


    }
}
