package nl.globaltraining.dag2;

public class Movie {

    private String title;
    private int duurInMinuten;
    private String genre;

    public Movie(String title, int duurInMinuten, String genre) {
        setTitle(title);
        setDuurInMinuten(duurInMinuten);
        this.genre = genre;
    }
    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            System.out.println("Ongeldige titel: mag niet leeg zijn");
            return;
        }
        this.title = title;
    }
    public void setDuurInMinuten(int duurInMinuten) {
        if (duurInMinuten <= 0 || duurInMinuten >= 500) {
            System.out.println("Ongeldige duur in minuten");
            return;
        }
        this.duurInMinuten = duurInMinuten;
    }
    public String toString() {
        return title + ", " + duurInMinuten + " min, " + genre + " ";
    }
}
