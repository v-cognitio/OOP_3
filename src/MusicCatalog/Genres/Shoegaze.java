package MusicCatalog.Genres;

public class Shoegaze extends Genre {

    private static Shoegaze instance = new Shoegaze();

    public static Shoegaze getInstance() { return instance; }

    private Shoegaze() {
        parents.add(AlternativeRock.getInstance());
        parents.add(Indie.getInstance());
    }
}