package day12.Task5;

import day12.Task4.MusicBand;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {

    public static void main(String[] args){
        MusicBand bandOne =  new MusicBand("OffSpring", 1984,
                                    new ArrayList<MusicArtist>(Arrays.asList(
                                            new MusicArtist("Dexter Holland",56),
                                            new MusicArtist("Noodles", 45),
                                            new MusicArtist("Todd Morse",56),
                                            new MusicArtist("Jonah Nimoy",47),
                                            new MusicArtist("Brandon Pertzborn",51)
                                                                            )
                                                            )
                                        );
        MusicBand bandTwo =  new MusicBand("Scorpions", 1965,
                                    new ArrayList<MusicArtist>(Arrays.asList(
                                            new MusicArtist("Rudolf Schenker", 67),
                                            new MusicArtist("Klaus Meine", 76),
                                            new MusicArtist("Matthias Jabs", 69),
                                            new MusicArtist("Paweł Mąciwoda", 70),
                                            new MusicArtist("Mikkey Dee", 80))
                                                                            )
                                            );
            System.out.println(bandOne.toString());
            System.out.println(bandTwo.toString());
            MusicBand.transferMembers(bandOne, bandTwo);
            System.out.println(bandOne.toString());
            System.out.println(bandTwo.toString());
        }
    }

