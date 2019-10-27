package MusicCatalog;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Tools {

    public static <T> List<T> findByPredicate(Iterable<T> collection, Predicate<T> predicate) {
        List<T> res = new ArrayList<>();
        for (T element : collection) {
            if (predicate.test(element)) {
                res.add(element);
            }
        }

        return res;
    }
}
