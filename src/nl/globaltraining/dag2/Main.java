package nl.globaltraining.dag2;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Main {
    public static void main(String[] args) {

        List<Movie> films = new ArrayList<>();

        films.add(new Movie ("Dune", 155, "Science Fiction"));
        films.add(new Movie ("Barbie", 93, "Fantasy"));
        films.add(new Movie ("Up", 82, "Fantasy"));
        films.add(new Movie ("Harry Potter", 103, "Fantasy"));
        films.add(new Movie ("Verliefd op Ibiza", 81, "Romantisch"));

       int nummer = 1;
       for (Movie film : films) {
           System.out.println(nummer + ". " + film);
           nummer++;
       }
        System.out.println("In totaal " + films.size() + " films");
    }
}
