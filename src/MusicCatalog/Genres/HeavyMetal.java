package MusicCatalog.Genres;

public class HeavyMetal extends Genre {

    private static HeavyMetal instance = new HeavyMetal();

    public static HeavyMetal getInstance() { return instance; }

    private HeavyMetal() {
        parents.add(Metal.getInstance());
    }
}
