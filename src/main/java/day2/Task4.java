package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double lowerLimit = -3;
        double upperLimit = 5;
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите чилсо x: ");
        double xNumber = scn.nextDouble();
        double yNumber;

        if(xNumber > lowerLimit && xNumber < upperLimit){
            yNumber = (xNumber + 3) * (Math.pow(xNumber, 2) - 2);
        }else if(xNumber >= upperLimit){
            yNumber = (Math.pow(xNumber, 2) - 10) / (xNumber + 7);
        }else{
            yNumber = 420;
        }
        System.out.println("y равен:" + yNumber);
    }
}