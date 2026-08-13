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

        Movie dune = new Movie("Dune", 155, "Sci-Fi");
        Movie barbie = new Movie("Barbie", 93, "Fantasy");
        Movie up = new Movie("Up", 81, "Fantasy");

        Customer donna = new Customer("Donna", 25, "donna@mail.com", TRUE);
        Customer sam = new Customer("Sam", 34, "sam@mail.com", FALSE);

        System.out.println("=== Films ===");
        System.out.println(dune);
        System.out.println(barbie);
        System.out.println(up);

        System.out.println();
        System.out.println("=== Klanten ===");
        System.out.println(donna);
        System.out.println(sam);

        System.out.println("=== Bon ===");
        Booking b1 = new Booking(donna, up, 2, "3D");
        b1.toonBon();
    }
}
