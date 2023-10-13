package Shapes;

public abstract class TwoDimensionalShape extends Shape {
    double lenght;

    public TwoDimensionalShape() {
        
    }

    public TwoDimensionalShape(double lenght) {
        if(lenght>0) this.lenght = lenght;
    }

    public abstract double getArea();
}
