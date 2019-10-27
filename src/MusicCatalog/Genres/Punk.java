package MusicCatalog.Genres;

public class Punk extends Genre {

    private static Punk instance = new Punk();

    public static Punk getInstance() { return instance; }

    private Punk() {
        parents.add(Rock.getInstance());
    }
}
