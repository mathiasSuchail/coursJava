import java.util.Collection;
import java.util.List;

public interface CartoonManager {
    public String getTitleOfMostRecentCartoon(Collection<Cartoon> cartoonMap);
    public List<String> getTitlesOfCartoonFromMusician(String musician, Collection<Cartoon> cartoonMap);
    public String getTitleOfLongestCartoon(Collection<Cartoon> cartoonMap);
    public List<String> getAllDirectorsOfAllMovies(Collection<Cartoon> cartoonMap);
    public List<String> getAllMusiciansOfAllMovies(Collection<Cartoon> cartoonMap);
    public List<String> getCartoonTitlesWithEvenDuration(Collection<Cartoon> cartoonMap);
    public List<String> getCartoonTitlesReleasedAfterCertainYear (Collection<Cartoon> cartoonMap, int theCertainYear);
}
