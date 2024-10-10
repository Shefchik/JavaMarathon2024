package day0;

public class Task5 {
    public static void main(String[] args){
        String startStr = "Олимпиада ";
        String endStr = " года";
        short step = 4;
        int lowerLimit = 1980;
        int upperLimit = 2020;
        for(int counter = lowerLimit; counter <= upperLimit; counter+=step) {
            System.out.println(startStr + " " + counter + " " + endStr);
        }
    }
}
