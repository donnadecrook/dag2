package nl.globaltraining.dag2;

public class Main {
    public static void main(String[] args) {

        Movie dune = new Movie ("Dune", 155, "Sci-Fi");
        Movie barbie = new Movie ("Barbie", 93, "Fantasy");
        Movie up = new Movie ("Up", 81, "Fantasy");

        Customer donna = new Customer("Donna", 25, "donna@mail.com");
        Customer sam = new Customer("Sam", 34, "sam@mail.com");

        System.out.println("=== Films ===");
        System.out.println(dune);
        System.out.println(barbie);
        System.out.println(up);

        System.out.println();
        System.out.println("=== Klanten ===");
        System.out.println(donna);
        System.out.println(sam);
    }

}
