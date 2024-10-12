package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество этажей:");
        int numberOfFloors = scanner.nextInt();
        if(numberOfFloors >= 0){
            if(numberOfFloors > 0 && numberOfFloors < 5){
                System.out.println("Малоэтажный дом");
            }else if(numberOfFloors >= 5 && numberOfFloors < 9){
                System.out.println("Среднеэтажный дом");
            } else if(numberOfFloors >= 9){
                System.out.println("Многоэтажный дом");
            }
        }else{
            System.out.println("Ошибка ввода");
        }
    }
}
