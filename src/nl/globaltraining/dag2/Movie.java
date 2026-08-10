package nl.globaltraining.dag2;

public class Movie {
    String title;
    int duurInMinuten;
    String genre;

    public Movie(String title, int duurInMinuten, String genre) {
        this.title = title;
        this.duurInMinuten = duurInMinuten;
        this.genre = genre;
    }
    public String toString() {
        return title + " " + duurInMinuten + " " + genre;
    }
}
