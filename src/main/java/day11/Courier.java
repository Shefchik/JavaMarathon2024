package day11;

public class Courier extends Employee implements Worker  {
    private String bicycleModel;
    private static final int PAYMENT_FOR_WORK = 100;
    private static final int BONUS_ORDERS_COURIER_AMOUNT = 50_000;
    private static final int BONUS_ORDERS_COURIER_NUMBERS = 10_000;

    public void doWork(){
        super.setSalary(super.getSalary() + PAYMENT_FOR_WORK);
        WareHouse wareHouse = super.getWareHouse();
        wareHouse.setCountDeliveredOrders(wareHouse.getCountDeliveredOrders() +  1);
        if(wareHouse.getCountDeliveredOrders() == BONUS_ORDERS_COURIER_NUMBERS) {
            if(!getIsPayed()) {
                bonus();
            }else {
                System.out.println("Бонус уже был выплачен");
            }
        }
    }

    public String toString(){
        return super.toString() + ", модель велосипеда: " + this.bicycleModel;
    }

    public Courier(String fIo, String birthDate, int salary, boolean isPayed, String biCycleModel, WareHouse wareHouse) {
        super(fIo, birthDate, salary, isPayed, wareHouse);
        this.bicycleModel = biCycleModel;
    }

    public void bonus(){
        super.setSalary(super.getSalary() + BONUS_ORDERS_COURIER_AMOUNT);
        super.setIsPayed(true);
    }
}
