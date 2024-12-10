package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    private static final int ARRAY_SIZE = 10;

    public static void main(String[] args){
        File file = new File ("test.txt");
        printSumDigits(file);
    }
    public static void printSumDigits(File file) {
        try {
            Scanner scn = new Scanner(file);
            String line = scn.nextLine();
            String stringNumbers[] = line.split(" ");
            int counter = 0;
            int[] numbers = new int[100];
            int numbersSum = 0;
            for(String number : stringNumbers){
                numbers[counter] =Integer.parseInt(number);
                numbersSum += numbers[counter];
                counter++;
            }
            if((counter) < (ARRAY_SIZE) || (counter) > ARRAY_SIZE){
                throw new IOException("Некорректный входной файл");
            }
            System.out.println(numbersSum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }



    /*
    *  Реализовать статический метод printSumDigits(File file), который считает сумму всех чисел в этом файле и выводит ее на экран.
Если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить в консоль сообщение “Файл не найден”. Помимо этого, если чисел в файле меньше или больше 10, необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
Вызвать данный метод в методе main()
    * */
}
