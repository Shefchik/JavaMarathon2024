package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToStringList(file).toString());
    }

    private static List<String> parseFileToStringList(File file) {
        List<String> namesAndAges = new ArrayList<>();
        try {
            Scanner scn = new Scanner(file);
            while (scn.hasNextLine()) {
                String str = scn.nextLine();
                String[] elements = str.split(" ");
                if (Integer.parseInt(elements[1]) < 0) {
                    throw new IOException();
                }
                namesAndAges.add(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
            return new ArrayList<>();
        }
        return namesAndAges;
    }
}