package day12.Task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List members;

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

    public List getMembers() {
        return members;
    }

    public void setMembers(List members) {
        this.members = members;
    }

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
        this.members = new ArrayList<>();
    }

    public MusicBand(String name, int year, List members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public static void transferMembers(MusicBand bandOne, MusicBand bandTwo){
        bandOne.getMembers().addAll(bandTwo.getMembers());
        bandTwo.getMembers().clear();
    }

    public void printMembers(){
        System.out.println(members.toString());
    }

    public String toString(){
        return "name: " + this.name + " year: " + this.year + " members: " + members.toString();
    }
}
