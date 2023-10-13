package Shapes;

public class Square extends TwoDimensionalShape {
    double lenght;
    public Square() {
    }

    public Square(double lenght) {
        super(lenght);
        if(lenght>0) this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return lenght * lenght;
    }

    

}
