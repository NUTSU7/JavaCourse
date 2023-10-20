import Shapes.Circle;
import Shapes.Polygon;
import Shapes.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        Circle circle = new Circle();
        Polygon square2 = new Square();
        Polygon circle2 = new Circle();
        System.out.println(square.render());
        System.out.println(square2.render());
        System.out.println(circle.render());
        System.out.println(circle2.render());
    }
}
