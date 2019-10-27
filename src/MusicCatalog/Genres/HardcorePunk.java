package MusicCatalog.Genres;

public class HardcorePunk extends Genre {

    private static HardcorePunk instance = new HardcorePunk();

    public static HardcorePunk getInstance() { return instance; }

    private HardcorePunk() {
        parents.add(Punk.getInstance());
        parents.add(HeavyMetal.getInstance());
    }
}
