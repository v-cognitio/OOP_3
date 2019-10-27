package MusicCatalog.Genres;

import java.util.ArrayList;
import java.util.List;

public abstract class Genre {
    protected List<Genre> parents = new ArrayList<>();

    public boolean isInstanceOf (Genre genre) {
        if (genre == this) {
            return true;
        }
        for (Genre g : parents)
        {
            if (genre == g) {
                return true;
            }
            else {
                if (g.isInstanceOf(genre)) {
                    return true;
                }
            }
        }
        return false;
    }
}
