package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list = fillList(0, 30);
        System.out.println(list.toString());
        list = fillList(300, 350);
        System.out.println(list.toString());
    }

    public static List<Integer> fillList(int counterFrom, int counterTo){
        List<Integer> listToFill = new ArrayList<>();
        for(int counter = counterFrom; counter < counterTo; counter++){
            if(counter%2 == 0){
                listToFill.add(counter);
            }
        }
        return listToFill;
    }
}
