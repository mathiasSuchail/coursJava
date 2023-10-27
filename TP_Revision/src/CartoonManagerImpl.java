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

    @Override
    public List<String> getAllDirectorsOfAllMovies(Collection<Cartoon> cartoonMap) {
        List<String> allDirectorsOfAllMovies = new ArrayList<>();
        for(Cartoon cartoon: cartoonMap){
            for (String director: cartoon.getDirectors()){
                if (!allDirectorsOfAllMovies.contains(director)) allDirectorsOfAllMovies.add(director);
            }
        }
        return allDirectorsOfAllMovies;
    }

    @Override
    public List<String> getAllMusiciansOfAllMovies(Collection<Cartoon> cartoonMap){
        List<String> allMusiciansOfAllMovies = new ArrayList<>();
        for(Cartoon cartoon: cartoonMap){
            for (String musician: cartoon.getMusicians()){
                if(!allMusiciansOfAllMovies.contains(musician)){
                    allMusiciansOfAllMovies.add(musician);
                }
            }
        }
        return allMusiciansOfAllMovies;
    }

    @Override
    public List<String> getCartoonTitlesWithEvenDuration(Collection<Cartoon> cartoonMap) {
        return cartoonMap.stream()
                .filter(cartoon -> cartoon.getDuration()%2==0)
                .map(Cartoon::getOriginalTitle)
                .toList();
    }

    @Override
    public List<String> getCartoonTitlesReleasedAfterCertainYear(Collection<Cartoon> cartoonMap, int theCertainYear) {
        return cartoonMap.stream()
                .filter(cartoon -> cartoon.getReleaseDate().getYear()>theCertainYear)
                .map(Cartoon::getOriginalTitle)
                .toList();
    }
}
