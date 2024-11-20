package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>(Arrays.asList("BMW", "Audi", "Lada", "Tata", "Moskvich"));
        System.out.println(list.toString());
        list.add(2, "Nissan");
        list.remove(0);
        System.out.println(list.toString());
    }
}
