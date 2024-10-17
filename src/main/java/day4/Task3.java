package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args){
        int arrayLengthX = 12;
        int arrayLengthY = 8;
        int rndUpperNumber  = 50;
        int numbers[][] = new int[arrayLengthX][arrayLengthY];

        Random rnd = new Random();
        int maxSumOfNumbers = 0;
        int counterXMaxNumbers = 0;
        for(int counterX = 0; counterX < numbers.length; counterX++){
            int currentMaxNumber = maxSumOfNumbers;
            for(int counterY = 0; counterY < numbers[counterX].length; counterY++){
                numbers[counterX][counterY] = rnd.nextInt(rndUpperNumber);
                currentMaxNumber += numbers[counterX][counterY];
            }
            if(currentMaxNumber > maxSumOfNumbers){
                maxSumOfNumbers = currentMaxNumber;
                counterXMaxNumbers = counterX;
            }
        }
        System.out.println(counterXMaxNumbers);
    }
}
