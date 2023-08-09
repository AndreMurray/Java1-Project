package shapes;

public class Square  extends Rectangle{

    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }
}
