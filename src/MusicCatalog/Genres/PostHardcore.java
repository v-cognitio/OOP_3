package MusicCatalog.Genres;

public class PostHardcore extends Genre {

    private static PostHardcore instance = new PostHardcore();

    public static PostHardcore getInstance() { return instance; }

    private PostHardcore() {
        parents.add(HardcorePunk.getInstance());
    }
}
