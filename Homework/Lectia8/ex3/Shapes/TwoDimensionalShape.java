package Shapes;

public abstract class TwoDimensionalShape extends Shape {

    public TwoDimensionalShape(double lenght) {
        super(lenght);
        if(lenght>0) this.lenght = lenght;
    }

    public abstract double getArea();
}
