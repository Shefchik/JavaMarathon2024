package day0;

public class Task4 {
    public static void main(String[] args){
        String startStr = "Олимпиада ";
        String endStr = " года";
        short step = 4;
        int counter = 1980;
        int upperLimit = 2020;
        while(counter <= upperLimit) {
            System.out.println(startStr + " " + counter + " " + endStr);
            counter +=step;
        }
    }
}
