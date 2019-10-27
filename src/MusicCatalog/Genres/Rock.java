package MusicCatalog.Genres;

public class Rock extends Genre {

    private static Rock instance = new Rock();

    public static Rock getInstance() { return instance; }

    private Rock() {}
}
