package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args){
        int arrayLength = 100;
        int rndUpperNumber  = 10000;
        int numbers[] = new int[arrayLength];

        Random rnd = new Random();
        for(int counter = 0; counter < numbers.length; counter++){
            numbers[counter] = rnd.nextInt(rndUpperNumber);
        }
        int numberThreshold = 2;
        int firstNumber = 0;
        int secondNumber = 0;
        int currentSumOfNumbers = 0;
        int maxSumOfNumbers = 0;
        int maxIndex = 0;
        for(int counter = 0; counter < numbers.length; counter++){
            if(counter >= numberThreshold){
                firstNumber = numbers[counter - numberThreshold];

                secondNumber = numbers[counter - numberThreshold + 1];
                currentSumOfNumbers = firstNumber + secondNumber + numbers[counter];
                if(currentSumOfNumbers > maxSumOfNumbers){
                    maxSumOfNumbers = currentSumOfNumbers;
                    maxIndex = counter - numberThreshold;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(maxSumOfNumbers);
        System.out.println(maxIndex);
    }
}