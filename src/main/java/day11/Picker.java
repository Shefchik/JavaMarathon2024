package day11;

public class Picker extends Employee implements Worker {
    private String strappingToolModel;
    private static final int BONUS_ORDERS_PICKER_AMOUNT = 70_000;
    private static final int BONUS_ORDERS_PICKER_NUMBERS = 10_000;
    private static final int PAYMENT_FOR_WORK = 80;

    public void doWork(){
        super.setSalary(super.getSalary() + PAYMENT_FOR_WORK);
        WareHouse wareHouse  = super.getWareHouse();
        wareHouse.setCountPickedOrders(wareHouse.getCountPickedOrders() +  1);
        if(wareHouse.getCountPickedOrders() == BONUS_ORDERS_PICKER_NUMBERS) {
            if(!getIsPayed()) {
                bonus();
            }else {
                System.out.println("Бонус уже был выплачен");
            }
        }
    }

    public String toString(){
        return super.toString() + ", модель стреппингового инструмента: " + this.strappingToolModel;
    }

    public Picker(String fIo, String birthDate, int salary, boolean isPayed, String strappingToolModel, WareHouse wareHouse) {
        super(fIo, birthDate, salary, isPayed, wareHouse);
        this.strappingToolModel = strappingToolModel;
    }
    public void bonus(){
        super.setSalary(super.getSalary() + BONUS_ORDERS_PICKER_AMOUNT);
        super.setIsPayed(true);
    }
}