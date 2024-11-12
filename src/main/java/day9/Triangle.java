package day9;

public class Triangle extends Figure{
    private double firstSide;
    private double secondSide;
    private double thierdSide;

    public Triangle(int firstSide, int secondSide, int thierdSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thierdSide = thierdSide;
    }

    @Override
    public double area(){
        double halfPerimiter;
        halfPerimiter = (this.firstSide + this.secondSide + this.thierdSide)/2;

        return Math.sqrt(halfPerimiter * (halfPerimiter - firstSide) * (halfPerimiter - secondSide) * (halfPerimiter - thierdSide));
    }

    @Override
    public double perimeter(){
        return (this.firstSide + this.secondSide + this.thierdSide);
    }
}
