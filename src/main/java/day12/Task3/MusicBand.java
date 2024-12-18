package day12.Task3;

public class MusicBand {
    private String name;
    private int year;

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String toString(){
        return "name: " + this.name + " year: " + this.year;
    }
}
