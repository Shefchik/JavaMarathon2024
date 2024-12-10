package day11;

public class WareHouse {
    private  int countPickedOrders;
    private int countDeliveredOrders;

    public WareHouse() {
        this.countPickedOrders = 0;
        this.countDeliveredOrders = 0;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }
}
