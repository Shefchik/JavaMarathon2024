package day9;

public abstract class Figure {
    private String color;

    public abstract double area();
    public abstract double perimeter();

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
