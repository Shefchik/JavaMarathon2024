package day15;

import java.io.File;

public class Task1 {
    public static void main(String[] args){
        File file = new File("shoes.csv");
        Shoes shoes = new Shoes();
        shoes.readShoesFile(file);
        File fileToWrite = new File("src/main/resources/data.txt");
        shoes.printToFile(fileToWrite);
    }

}
