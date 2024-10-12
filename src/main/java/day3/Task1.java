package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String city;
        String countryToFind;

        while(true){
            System.out.print("Введите город: ");
            city  = scn.nextLine();
            if (city.equals("Stop")){
                System.out.println("*программа завершила работу*");
                break;
            }
            switch(city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    countryToFind = "Россия";
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    countryToFind = "Италия";
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    countryToFind = "Англия";
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    countryToFind = "Германия";
                    break;
                default:
                    countryToFind = "Неизвестная страна";
                    break;
            }
            System.out.println(countryToFind);
        }
    }
}
