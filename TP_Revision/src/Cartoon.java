import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cartoon {
    String originalTitle;
    String production;
    List<String> directors;
    List<String> musicians;
    int duration;
    LocalDate releaseDate;
    String genre;
    String durationInHours;

    public Cartoon(String originalTitle, String production, List<String> directors, List<String> musicians, int duration, LocalDate releaseDate, String genre) {
        this.originalTitle = originalTitle;
        this.production = production;
        this.directors = directors;
        this.musicians = musicians;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public List<String> getDirectors() {
        return directors;
    }

    public void setDirectors(List<String> directors) {
        this.directors = directors;
    }

    public List<String> getMusicians() {
        return musicians;
    }

    public void setMusicians(List<String> musicians) {
        this.musicians = musicians;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDurationInHours() {
        return durationInHours;
    }

    public String toString(){
        Map<String, Integer> duration = new HashMap<>();
        duration.put("secondes", this.duration%60);
        duration.put("minutes", (this.duration/60)%60);
        duration.put("heures", this.duration/3600);
        return "La durée du film est de "+duration.get("heures")+" heures, "+duration.get("minutes")+" minutes et "+duration.get("secondes")+" secondes.";
    }
}
