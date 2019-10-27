package MusicCatalog.Genres;

public class AlternativeRock extends Genre {

    private static AlternativeRock instance = new AlternativeRock();

    public static AlternativeRock getInstance() { return instance; }

    private AlternativeRock() {
        parents.add(Rock.getInstance());
    }
}
