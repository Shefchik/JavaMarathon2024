package day9;

public class TestFigures {
    private static final String LOOKED_FOR_COLOR = "Red";

    public static  void main(String[] args){

        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
        System.out.println("calculated Red Perimeter = " + calculateRedPerimeter(figures));
        System.out.println("calculated Red Area = " + calculateRedArea(figures) );
    }
    public static double calculateRedPerimeter(Figure[] figures){
        double result = 0;
        for(Figure figure : figures){
            if(LOOKED_FOR_COLOR.equals(figure.getColor())){
                result += figure.perimeter();
            }
        }
        return result;
    }

    public static double calculateRedArea(Figure[] figures){
        double result = 0;
        for(Figure figure : figures){
            if(LOOKED_FOR_COLOR.equals(figure.getColor())){
                result += figure.area();
            }
        }
        return result;

    }

}
