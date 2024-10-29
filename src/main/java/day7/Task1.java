package day7;

public class Task1 {
    public static void main(String[] args){
        Airplane airplaneOne = new Airplane("Il", 2020, 250, 10000);
        Airplane airplaneTwo = new Airplane("Il", 2010, 350, 10000);
        Airplane.vewMaxLengthWithinTheTwo(airplaneOne, airplaneTwo);
    }
}
