package day9;

public class Rectangle extends Figure{
    private int width;
    private int height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double area(){

        return this.width * this.height;

    }

    @Override
    public double perimeter(){
        return 2 * width + 2 * height;
    }
}
