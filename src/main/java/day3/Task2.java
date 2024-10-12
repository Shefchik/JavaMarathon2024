package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        double firstDouble;
        double secondDouble;

        while(true){
            firstDouble  = scn.nextDouble();
            secondDouble  = scn.nextDouble();
            if(secondDouble != 0){
                System.out.println(firstDouble/secondDouble);
            }else{
                break;
            }
        }
    }
}
