package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        int modFive = 5;
        int modTen = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int aNumber = scanner.nextInt();
        System.out.print("Введите число b: ");
        int bNumber = scanner.nextInt();

        if(aNumber < bNumber) {
            int counter = aNumber;
            while(counter < bNumber){
                if(counter%modFive == 0 & counter%modTen != 0){
                    System.out.print(counter + " ");
                }
                counter++;
            }
        }else{
            System.out.println("Некорректный ввод");
        }
    }
}
