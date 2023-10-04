public class Circle {
    int radius;

    public void calculateArea() {
        System.out.println(3.14 * Math.pow(radius, 2));
    }

    Circle(int radius) {
        this.radius = radius;
    }
}
