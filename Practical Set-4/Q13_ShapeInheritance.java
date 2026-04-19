class Shape {
    double d1, d2;

    void getData(double a, double b) {
        d1 = a;
        d2 = b;
    }
}

class Triangle extends Shape {
    void area() {
        double area = 0.5 * d1 * d2;
        System.out.println("Triangle Area: " + area);
    }
}

class Rectangle extends Shape {
    void area() {
        double area = d1 * d2;
        System.out.println("Rectangle Area: " + area);
    }
}

public class TestShape {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.getData(10, 5);
        t.area();

        Rectangle r = new Rectangle();
        r.getData(4, 6);
        r.area();
    }
}
