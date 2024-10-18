package day5;

public class Task2 {
    public static void main(String[] args){
        MotorBike motorbike = new MotorBike("honda", "black", 2007);
        System.out.println("motorbike, model: "+ motorbike.getModel() + " color: " + motorbike.getColor() + " production year: " + motorbike.productionYear);
    }

    private static class MotorBike{
        private String model;
        private String color;
        private int productionYear;

        public MotorBike(String model, String color, int productionYear){
            this.model = model;
            this.color = color;
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
