package Shapes;

public class Circle extends TwoDimensionalShape{
    double lenght;
    public Circle() {
    }

    public Circle(double lenght) {
        super(lenght);
        if(lenght>0) this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return 3.14 * lenght * lenght;
    }
}
