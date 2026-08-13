package nl.globaltraining.dag2;

public class Booking {
    private Customer klant;
    private Movie film;
    private int aantalKaartjes;
    private String zaaltype;

    public Booking(Customer klant, Movie film, int aantalKaartjes, String zaaltype) {
        this.klant = klant;
        this.film = film;
        this.aantalKaartjes = aantalKaartjes;
        this.zaaltype = zaaltype;
    }

    public double berekenPrijsPerKaartje() {
        double prijs;
        int age = klant.getAge();
        if (age < 12) {
            prijs = 8.50;
        }  else if (age < 18) {
            prijs = 10.00;
        } else if (age >= 65) {
            prijs = 9.50;
        } else {
            prijs = 12.50;
        }

        if (klant.isStudent()) {
            prijs = prijs - 2.00;
        }

        if (zaaltype.equalsIgnoreCase("IMAX")) {
            prijs = prijs + 5.00;
        }
        else if (zaaltype.equalsIgnoreCase("3D")) {
            prijs = prijs + 3.00;
        }
        else if (zaaltype.equalsIgnoreCase("VIP")) {
            prijs = prijs + 7.50;
        }

        if (prijs < 5.00) {
            prijs = 5.00;
        }
        return prijs;
    }

    public double berekenTotaal(double prijs) {
        double totaal = prijs * aantalKaartjes;
        return totaal;
    }

    public void toonBon() {
        System.out.println("Klant: " + klant);
        System.out.println("Film: " + film);
        System.out.println("Zaaltype: " + zaaltype);
        System.out.println("Aantal: " + aantalKaartjes);
        System.out.println("Prijs per kaartje: " + berekenPrijsPerKaartje());
        System.out.println("Totaal: " + berekenTotaal(berekenPrijsPerKaartje()));
    }

    public Customer getKlant() {
        return klant;
    }

    public Movie getFilm() {
        return film;
    }

    public int getAantalKaartjes() {
        return aantalKaartjes;
    }

    public String getZaaltype() {
        return zaaltype;
    }
}