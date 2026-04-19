class Rectangle {
    double width = 1;
    double height = 1;

    // No-argument constructor
    Rectangle() {
    }

    // Parameterized constructor
    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    // Method to calculate area
    double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    double getPerimeter() {
        return 2 * (width + height);
    }

    // Main method to test
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 3);

        System.out.println("Rectangle 1 Area: " + r1.getArea());
        System.out.println("Rectangle 1 Perimeter: " + r1.getPerimeter());

        System.out.println("Rectangle 2 Area: " + r2.getArea());
        System.out.println("Rectangle 2 Perimeter: " + r2.getPerimeter());
    }
}
