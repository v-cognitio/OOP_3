package MusicCatalog.Genres;

public class HardRock extends Genre {

    private static HardRock instance = new HardRock();

    public static HardRock getInstance() { return instance; }

    private HardRock() {
        parents.add(Rock.getInstance());
    }
}
