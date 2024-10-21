package day6;

public class Task2 {
    public static  void main(String[] args){
        Airplane airplane = new Airplane("Il", 2020, 250, 10000);
        airplane.setYear(2019);
        airplane.setLength(200);
        airplane.fillUp(1000);
        airplane.fillUp(5000);
        airplane.info();
    }
}
