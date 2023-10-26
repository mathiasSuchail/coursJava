import java.util.Collection;
import java.util.List;

public interface CartoonManager {
    public String getTitleOfMostRecentCartoon(Collection<Cartoon> cartoonMap);
    public List<String> getTitlesOfCartoonFromMusician(String musician, Collection<Cartoon> cartoonMap);
    public String getTitleOfLongestCartoon(Collection<Cartoon> cartoonMap);
}
