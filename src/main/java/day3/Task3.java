package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        double firstDouble;
        double secondDouble;
        int upperLimit = 5;
        int counter = 0;
        while(counter < upperLimit){
            firstDouble  = scn.nextDouble();
            secondDouble  = scn.nextDouble();
            if(secondDouble == 0){
                System.out.println("Деление на 0");
                continue;
            }else{
                System.out.println(firstDouble/secondDouble);
            }
            counter++;
        }
    }
}