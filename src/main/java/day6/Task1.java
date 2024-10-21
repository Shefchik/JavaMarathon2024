package day6;

public class Task1 {
    public static void main(String[] args){
        Car car = new Car();
        car.setColor("blue");
        car.setModel("civic");
        car.setProductionYear(2007);
        car.info();
        System.out.println("Разница введенного года и года изготовления: " + car.yearDifference(1997));

        Motorbike motorBike = new Motorbike("kawasaki", "black", 2010);
        motorBike.info();
        System.out.println("Разница введенного года и года изготовления: " + motorBike.yearDifference(2019));

    }
}
