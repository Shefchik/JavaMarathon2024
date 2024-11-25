package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToObjList(file).toString());
    }

    private static List<Person> parseFileToObjList(File file) {
        List<Person> namesAndAges = new ArrayList<>();
        try {
            Scanner scn = new Scanner(file);
            while (scn.hasNextLine()) {
                String str = scn.nextLine();
                String[] elements = str.split(" ");

                if (Integer.parseInt(elements[1]) < 0) {
                    throw new IOException();
                }
                namesAndAges.add(new Person(elements[0], Integer.parseInt(elements[1])));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
        return namesAndAges;
    }
}
