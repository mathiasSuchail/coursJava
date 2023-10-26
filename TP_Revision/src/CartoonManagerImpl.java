import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class CartoonManagerImpl implements CartoonManager{
    @Override
    public String getTitleOfMostRecentCartoon(Collection<Cartoon> cartoonMap) {
        String titleOfMostRecentCartoon = null;
        LocalDate mostRecentPublishYear = LocalDate.MIN;

        for(Cartoon cartoon: cartoonMap)
        {
            if (cartoon.getReleaseDate().isAfter(mostRecentPublishYear)){
                titleOfMostRecentCartoon = cartoon.getOriginalTitle();
                mostRecentPublishYear = cartoon.getReleaseDate();
            }
        }
        return titleOfMostRecentCartoon;
    }

    @Override
    public List<String> getTitlesOfCartoonFromMusician(String musician, Collection<Cartoon> cartoonMap) {
        List<String> movieTitles=new ArrayList<>();
        for(Cartoon cartoon: cartoonMap){
            if (cartoon.getMusicians().contains(musician)){
                movieTitles.add(cartoon.getOriginalTitle());
            }
        }
        return movieTitles;
    }

    @Override
    public String getTitleOfLongestCartoon(Collection<Cartoon> cartoonMap) {
        String titleOfLongestCartoon=null;
        int longestTime=0;
        for(Cartoon cartoon: cartoonMap){
            if (cartoon.getDuration()>longestTime){
                titleOfLongestCartoon = cartoon.getOriginalTitle();
                longestTime = cartoon.getDuration();
            }
        }
        return titleOfLongestCartoon;
    }
}
