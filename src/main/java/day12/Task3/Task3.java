package day12.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args){
        List<MusicBand> bandsList = new ArrayList<>(Arrays.asList(new MusicBand("Beatles", 1960),
                                                        new MusicBand("OffSpring", 2001),
                                                        new MusicBand("Cat Stevens", 1965),
                                                        new MusicBand("Metallica", 1974),
                                                        new MusicBand("Scorpions", 1965),
                                                        new MusicBand("Cranberries", 2005),
                                                        new MusicBand("DDT", 1989),
                                                        new MusicBand("Nautilus Pompilius", 1985),
                                                        new MusicBand("Slayer", 1975),
                                                        new MusicBand("Ariya", 1989)));
        Collections.shuffle(bandsList);
        List<MusicBand> bandsAfter2000List = groupsAfter2000(bandsList);
        System.out.println(bandsList.toString());
        System.out.println(bandsAfter2000List.toString());
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for(MusicBand band : bands){
            if(band.getYear() > 2000){
                bandsAfter2000.add(band);
            }
        }
        return bandsAfter2000;
    }
}
