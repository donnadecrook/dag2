package nl.globaltraining.dag2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        System.out.println("\n" + "Zoek op titel: ");
        String title = scanner.nextLine();
        Movie gevonden = zoekOpTitel(title, films);
        System.out.println(gevonden);

        if (gevonden == null) {
            System.out.println("\n" + "Film niet gevonden");
        }

        System.out.println("\n" + "Filter op genre: ");
        String genre = scanner.nextLine();
        Movie gevondenFilms = filterOpGenre(genre, films);
        System.out.println(gevondenFilms);

        if (gevondenFilms == null) {
            System.out.println("Geen films gevonden met dit genre");
        }

        Movie langsteFilm = langsteFilm(films);
        System.out.println("\n" + "De film met de langste speelduur is " + langsteFilm);


    }
    public static Movie zoekOpTitel(String title, List<Movie> films) {
        for (Movie film: films){
            if (film.getTitle().equals(title)){
                return film;
            }
        }
        return null;
    }
    public static Movie filterOpGenre(String genre, List<Movie> films) {
        for (Movie film : films) {
            if (film.getGenre().equals(genre)) {
                return film;
            }
        }
        return null;
    }
    public static Movie langsteFilm(List<Movie> films) {
        Movie langste = null;
        for (Movie film: films) {
            if (film.getDuurInMinuten() > langste.getDuurInMinuten()) {
                langste = film;
            }
        }
        return langste;
    }
}
