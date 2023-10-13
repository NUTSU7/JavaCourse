package Shapes;

public class Sphere extends ThreeDimensionalShape{
    public Sphere(double lenght) {
        super(lenght);
        if(lenght>0) this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return 4 * 3.14 * lenght * lenght;
    }

    @Override
    public double getVolume() {
        return 4/3 * 3.14 * Math.pow(lenght, 3);
    }
}
