package pl.lapinski.pracadomowa_tydzien6.model;

public class Film {

    private String title;
    private String producer;
    private int year;

    public Film(String title, String producer, int year) {
        this.title = title;
        this.producer = producer;
        this.year = year;
    }

    public Film() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public long getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", producer='" + producer + '\'' +
                ", year=" + year +
                '}';
    }
}

