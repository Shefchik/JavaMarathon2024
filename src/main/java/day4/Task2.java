package day4;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        int arrayLength = 10;
        int rndUpperNumber  = 10000;
        int rndLowerNumber = 0;
        int numbers[] = new int[arrayLength];

        Random rnd = new Random();

        for(int counter = 0; counter < numbers.length; counter++){
            numbers[counter] = rnd.nextInt(rndUpperNumber);
        }

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        int numberOfZeroEnded = 0;
        int sumNumberOfZeroEnded = 0;
        for(int number : numbers){
            if(number > maxNumber){
                maxNumber = number;
            }
            if(number < minNumber){
                minNumber = number;
            }
            if(number%10 == 0){
                numberOfZeroEnded++;
                sumNumberOfZeroEnded += number;
            }
        }

        System.out.println("Наибольший элемент массива: " + maxNumber);
        System.out.println("Наименьший элемент массива: " + minNumber);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + numberOfZeroEnded);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sumNumberOfZeroEnded);
    }
}
