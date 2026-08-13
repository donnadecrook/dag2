package nl.globaltraining.dag2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Movie> films = new ArrayList<>();

        films.add(new Movie ("Dune", 155, "Science Fiction"));
        films.add(new Movie ("Barbie", 93, "Fantasy"));
        films.add(new Movie ("Up", 82, "Fantasy"));
        films.add(new Movie ("Harry Potter", 103, "Fantasy"));
        films.add(new Movie ("Verliefd op Ibiza", 81, "Romantisch"));

        films.remove(1);

       int nummer = 1;
       for (Movie film : films) {
           System.out.println(nummer + ". " + film);
           nummer++;
       }
        System.out.println("In totaal " + films.size() + " films");
    }
    public Movie zoekOpTitel(String title, ArrayList<Movie> films) {
        for (Movie film: films){
            if (film.getTitle().equals(title)){
                return film;
            }
        }
        return null;
    }
    List<Movie> result = new ArrayList<>();
        for (Movie film : films) {
        if (film.getGenre().equals("Fantasy")) {
            result.add(film);
        }
    }
}
