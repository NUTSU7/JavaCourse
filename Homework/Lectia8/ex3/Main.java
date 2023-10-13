import Shapes.Shape;
import Shapes.Sphere;

public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(2);
        System.out.println(sphere.getArea()+" "+sphere.getVolume());
    }
}
