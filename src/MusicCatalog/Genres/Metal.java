package MusicCatalog.Genres;

public class Metal extends Genre {

    private static Metal instance = new Metal();

    public static Metal getInstance() { return instance; }

    private Metal() {
        parents.add(HardRock.getInstance());
    }
}
