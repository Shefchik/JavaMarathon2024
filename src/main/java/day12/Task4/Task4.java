package day12.Task4;


import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args){
        MusicBand bandOne =  new MusicBand("OffSpring", 1984, new ArrayList<String>(Arrays.asList("Dexter Holland",
                                                                                        "Noodles",
                                                                                        "Todd Morse",
                                                                                        "Jonah Nimoy",
                                                                                        "Brandon Pertzborn")));
        MusicBand bandTwo =  new MusicBand("Scorpions", 1965, new ArrayList<String>(Arrays.asList("Rudolf Schenker",
                                                                                       "Klaus Meine",
                                                                                       "Matthias Jabs",
                                                                                       "Paweł Mąciwoda",
                                                                                       "Mikkey Dee")));
        System.out.println(bandOne.toString());
        System.out.println(bandTwo.toString());
        MusicBand.transferMembers(bandOne, bandTwo);
        System.out.println(bandOne.toString());
        System.out.println(bandTwo.toString());

    }
}
