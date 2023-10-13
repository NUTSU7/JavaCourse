package Shapes;

public abstract class ThreeDimensionalShape extends Shape {

    public ThreeDimensionalShape(double lenght) {
        super(lenght);
        if(lenght>0) this.lenght = lenght;
    }

    public abstract double getArea();
    public abstract double getVolume();
}
