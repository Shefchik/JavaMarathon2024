package day11;

public class Task1 {
    private static final int UPPER_LIMIT = 10_000;
    public static void main(String[] args) {
        WareHouse wareHouseOne = new WareHouse();
        Courier courierOne = new Courier("Иванов Иван Иванович", "22.04.2006", 0, false, "Kona 235", wareHouseOne);
        Picker pickerOne = new Picker("Кириллов Петр Иванович", "12.02.2004", 0, false, "GreenWorks 23TX", wareHouseOne);
        for (int counter = 0; counter < UPPER_LIMIT + 1; counter++) {
            businessProcess(courierOne);
        }
        businessProcess(courierOne);
        System.out.println("1-й склад, Кол-во собранных заказов: " + wareHouseOne.getCountPickedOrders() + ", Кол-во доставленных заказов: " + wareHouseOne.getCountDeliveredOrders());
        System.out.println("Сборщик второго склада ЗП: " + pickerOne.getSalary() +"; Курьер второго склада ЗП: " + courierOne.getSalary());

        WareHouse wareHouseTwo = new WareHouse();
        Courier courierTwo = new Courier("Трифонованов Иван Иванович", "02.09.2005", 0, false, "Kona 235", wareHouseTwo);
        Picker pickerTwo = new Picker("Птеров Петр Иванович", "12.01.2003", 0, false, "GreenWorks 23TX", wareHouseTwo);
        for (int counter = 0; counter < UPPER_LIMIT + 1; counter++){
            businessProcess(pickerTwo);
        }
        businessProcess(courierTwo);
        System.out.println("2-й склад, Кол-во собранных заказов: " + wareHouseTwo.getCountPickedOrders() + ", Кол-во доставленных заказов: " + wareHouseTwo.getCountDeliveredOrders());
        System.out.println("Сборщик второго склада ЗП: " + pickerTwo.getSalary() +"; Курьер второго склада ЗП: " + courierTwo.getSalary());
    }
/*Выведите в консоль количество собранных и доставленных заказов на складе и ЗП каждого из сотрудников.
 */
    static void businessProcess(Worker worker){
            worker.doWork();
    }

}

