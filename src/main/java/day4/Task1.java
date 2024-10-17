package day4;

import java.util.Scanner;
import java.util.Random;

public class Task1 {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите  размерность массива(число n): ");
        int arrayLength = scn.nextInt();
        int numbers[] = new int[arrayLength];
        int eightNumber = 8;
        int oneNumber = 1;
        int twoNumber = 2;
        int countNumbersMoreThanEight = 0;
        int countNumbersEqualOne = 0;
        int countEvenNumbers = 0;
        int countNotEvenNumbers = 0;
        int sumNumbers = 0;

        Random rnd = new Random();

        for(int counter = 0; counter < numbers.length; counter++){
            numbers[counter] = rnd.nextInt(10) + 1;
            if(numbers[counter] > eightNumber){
                countNumbersMoreThanEight++;
            }
            if(numbers[counter] == oneNumber){
                countNumbersEqualOne++;
            }
            if(numbers[counter]%twoNumber == 0){
                countEvenNumbers++;
            }
            if(numbers[counter]%twoNumber != 0){
                countNotEvenNumbers++;
            }
            sumNumbers += numbers[counter];
        }
        for(int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Длине массива: " + numbers.length);
        System.out.println("Количестве чисел больше 8: " + countNumbersMoreThanEight);
        System.out.println("Количестве чисел равных 1: " + countNumbersEqualOne);
        System.out.println("Количестве четных чисел: " + countEvenNumbers);
        System.out.println("Количестве нечетных чисел: " + countNotEvenNumbers);
        System.out.println("Сумме всех элементов массива: " + sumNumbers);
    }
}
