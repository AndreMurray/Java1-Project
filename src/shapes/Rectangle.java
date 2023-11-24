package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength() {

    }

    @Override
    public void setWidth() {

    }
    //    First Shape exercise

//    protected double length;
//    protected double width;
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//
//    public double getArea() {
//        return this.length * this.width;
//    }
//
//    public double getPerimeter() {
//        return 2 * this.length + 2 * this.width;
//    }

}
