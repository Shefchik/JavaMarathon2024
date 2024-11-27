package day15;

import day14.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shoes {
    private List<Shoe> shoesZeroQuantityList;
    static final int LINE_SIZE = 3;
    static final int ZERO_QUANTITY = 0;
    public Shoes() {
        this.shoesZeroQuantityList = new ArrayList<>();
    }

    public List<Shoe> getShoesZeroQuantityList() {
        return shoesZeroQuantityList;
    }

    public void setShoesZeroQuantityList(List<Shoe> shoesZeroQuantityList) {
        this.shoesZeroQuantityList = shoesZeroQuantityList;
    }

    public void readShoesFile(File file){
        Scanner scn;
        String str;
        String[] elements = new String[3];
        String name = "";
        String size = "";
        String quantity = "";
        String iOExceptionString = "sss";
        try {
            scn = new Scanner(file);
            if(file.length() == 0){
                iOExceptionString = "Файл не содержит данных!";
                throw new IOException();
            }
            while (scn.hasNextLine()) {
                str = scn.nextLine();
                elements = str.split(";");
                if (elements.length != LINE_SIZE) {
                    iOExceptionString = "Запись из файла не корректна! Детали: " + str;
                    throw new IOException();
                }
                name = elements[0];
                size = elements[1];
                quantity = elements[2];

                Shoe shoe = new Shoe(name, Double.parseDouble(size), Integer.parseInt(quantity));
                if(Integer.parseInt(quantity) == ZERO_QUANTITY){
                    shoesZeroQuantityList.add(shoe);
                }
            }
        }catch (NumberFormatException e){
            System.out.println("Запись из файла не корректна по формату данных! Название: " + elements[0] + ", Размер: " + elements[1] + ", Количество: " + elements[2]);
        }catch (FileNotFoundException e) {
            System.out.println("Файл не найден!" + e.toString());
        }catch(IOException e){
            System.out.println(iOExceptionString + e.getMessage());
        }
    }
    public void printToFile(File file){
        file.getParentFile().mkdirs();
        try {
            PrintWriter printWriter = new PrintWriter(file);
            for(Shoe record : shoesZeroQuantityList){
                printWriter.println(record.getName() + ", " + record.getSize() + ", " + record.getQuantity());
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
