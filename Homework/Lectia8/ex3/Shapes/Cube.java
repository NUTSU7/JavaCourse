package Shapes;

public class Cube extends ThreeDimensionalShape{
    public Cube(double lenght) {
        super(lenght);
        if(lenght>0) this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return 6 * lenght * lenght;
    }

    @Override
    public double getVolume() {
        return Math.pow(lenght, 3);
    }
}
