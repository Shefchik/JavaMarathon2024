package day8;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public static void vewMaxLengthWithinTheTwo(Airplane planeOne, Airplane planeTwo){
        String str;
        if(planeOne.length > planeTwo.length){
            str = "Первый самолет длиннее";
        }else if(planeOne.length < planeTwo.length){
            str = "Второй самолет длиннее";
        }else{
            str = "Самолеты равны по длине";
        }
        System.out.println(str);
    }
    public void info(){
        System.out.println("Изготовитель: " + this.manufacturer
                            + ", год выпуска: " + this.year
                            + ", длина: " + length
                            + ", вес: " + this.weight
                            + ", количество топлива в баке: " + getFuel());
    }
    public void fillUp(int n){
        this.fuel += n;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

}