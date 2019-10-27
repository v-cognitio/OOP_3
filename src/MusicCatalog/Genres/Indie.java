package MusicCatalog.Genres;

public class Indie extends Genre {

    private static Indie instance = new Indie();

    public static Indie getInstance() { return instance; }

    private Indie() {}
}
