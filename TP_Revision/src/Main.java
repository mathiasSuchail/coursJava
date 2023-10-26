import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cartoon test = new Cartoon(
            "test",
            "sdfs",
            new ArrayList<String>(),
            new ArrayList<String>(),
            26345,
            LocalDate.now(),
            "drame"
        );

        System.out.println(test.toString());
    }
}