package day16;

import day15.Shoe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    private static final int  SLIDING_WINDOW = 20;
    private static final int  RANDOM_UPPER_LIMIT = 100;
    private static final int  NUMBERS_UPPER_LIMIT = 1000;
    private static List<Integer> intNumbers = new ArrayList<>();
    private static List<Double> doubleNumbers = new ArrayList<>();

    private static int resultSumAvg;

    public static void main(String[] args){
        generateRandomList();
        printToFile(intNumbers, "file1.txt");
        SaveSlidingWindowAVG();
        printToFile(doubleNumbers, "file2.txt");
        System.out.println("Сумма вещественных числе из file2.txt = " + resultSumAvg );
    }


    private static void generateRandomList(){
        Random rnd = new Random();
        int counter;
        for(counter = 0; counter < NUMBERS_UPPER_LIMIT; counter++){
            intNumbers.add(rnd.nextInt(rnd.nextInt(RANDOM_UPPER_LIMIT) + 1));
        }
    }

    private static void printToFile(List recordsToFile, String fileName){
        try {
            File fileToWrite = new File(fileName);
            PrintWriter printWriter = new PrintWriter(fileToWrite);
            for(int counter = 0; counter < recordsToFile.size(); counter++){
                printWriter.print(recordsToFile.get(counter) + " ");
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void SaveSlidingWindowAVG(){
        double avgSum = 0;
        for(int counter = (SLIDING_WINDOW - 1); counter < intNumbers.size(); counter += SLIDING_WINDOW){
            int numbersSum = intNumbers.get(counter)+ intNumbers.get(counter - 1) + intNumbers.get(counter - 2) + intNumbers.get(counter - 3);
            double avg = (double)numbersSum / SLIDING_WINDOW;
            doubleNumbers.add(avg);
            avgSum += avg;
        }
        resultSumAvg = (int) avgSum;
    }
}
