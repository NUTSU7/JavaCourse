package Shapes;

public abstract class ThreeDimensionalShape extends Shape {
    double lenght;

    public ThreeDimensionalShape() {
        
    }

    public ThreeDimensionalShape(double lenght) {
        if(lenght>0) this.lenght = lenght;
    }

    public abstract double getArea();
    public abstract double getVolume();
}
