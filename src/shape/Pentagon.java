package shape;

public class Pentagon extends Shape {

    private double side;

    public Pentagon(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 5 * side;
    }
}









