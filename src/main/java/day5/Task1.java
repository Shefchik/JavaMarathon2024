package day5;

public class Task1 {
    public static void main(String[] args){
        Car car = new Car();
        car.setModel("civic");
        car.setColor("black");
        car.setProductionYear(2007);

        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getProductionYear());
    }

    private static class Car{
        private String model;
        private String color;
        private int productionYear;

        public void setModel(String model) {
            this.model = model;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setProductionYear(int productionYear) {
            this.productionYear = productionYear;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getProductionYear() {
            return productionYear;
        }
    }

}
