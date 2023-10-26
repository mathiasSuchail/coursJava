import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        HashMap<String, Cartoon> cartoonMap =new HashMap<>();
        try {
            cartoonMap.put(
                    "Voyage autour du monde",
                    new Cartoon(
                            "Voyage autour du monde",
                            "Walt Disney Animation Studios, United Artists ",
                            new ArrayList<String>(Arrays.asList("Douglas Fairbanks", "Victor Fleming")),
                            new ArrayList<String>(Arrays.asList("Alfred Newman", "Arthur Lange")),
                            78,
                            LocalDate.of(1931, 12, 12),
                            "Aventure"
                    )
            );
        }catch(TooLongTitleException e){
            System.out.println(e.getMessage());
        }
        try {
            cartoonMap.put(
                    "Hollywood Party",
                    new Cartoon(
                            "Hollywood Party",
                            "Walt Disney Animation Studio, Metro-Goldwyn-Mayer",
                            new ArrayList<String>(Arrays.asList("Roy Rowland")),
                            new ArrayList<String>(Arrays.asList("Jack Barnett", "Nacio Herb Brown", "Walter Donaldson", "Jimmy Durante", "Richard Rodgers")),
                            70,
                            LocalDate.of(1934, 6, 1),
                            "Animation 2D / Film Live"
                    )
            );
        }catch (TooLongTitleException e){
            System.out.println(e.getMessage());
        }
        try {
            cartoonMap.put(
                    "Entrée de Service",
                    new Cartoon(
                            "Entrée de Service",
                            "Fox Film Corporation, Walt Disney Animation Studios ",
                            new ArrayList<String>(Arrays.asList("Frank Lloyd", "Walt Disney")),
                            new ArrayList<String>(Arrays.asList("Arthur Lange")),
                            88,
                            LocalDate.of(1934, 9, 26),
                            "Animation 2D / Film Live"
                    )
            );
        }catch (TooLongTitleException e){
            System.out.println(e.getMessage());
        }

        System.out.println("------ Liste des cartoons -----");
        cartoonMap.forEach((title, cartoon)->System.out.println(cartoon));

        System.out.println("----- Durée des cartoons -----");
        cartoonMap.forEach((title, cartoon)->System.out.println(cartoon.getDurationInHours()));

        System.out.println("----- Titres des cartoons -----");
        cartoonMap.forEach((title, cartoon)->System.out.println(title));

        System.out.println("----- Implementation de l'interface -----");
        CartoonManagerImpl cartoonManager = new CartoonManagerImpl();
        String musician = "Arthur Lange";
        System.out.println("Cartoon le plus long : "+cartoonManager.getTitleOfLongestCartoon(cartoonMap.values()));
        System.out.println("Cartoon le plus recent : "+cartoonManager.getTitleOfMostRecentCartoon(cartoonMap.values()));
        System.out.println("Cartoon avec le musicien "+musician+" : "+cartoonManager.getTitlesOfCartoonFromMusician(musician, cartoonMap.values()));


    }
}