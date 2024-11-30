package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        File file = new File ("test.txt");
        printResult(file);
    }

    public static void printResult(File file){
        Scanner scn = null;
        try {
            scn = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }

        String line = scn.nextLine();
        String stringNumbers[] = line.split(" ");
        int counter = 0;
        int numbersSum = 0;
        for(String number : stringNumbers){
            numbersSum += Integer.parseInt(number);
            counter++;
        }
        double avgNumber = (double)numbersSum/counter;
        System.out.println(avgNumber + " --> " + String.format("%.3f",avgNumber));
    }
}


