class Point {
    int x, y;

    Point() {
        x = 5;
        y = 5;
    }

    Point(int a, int b) {
        x = a;
        y = b;
    }

    Point(Point p) {
        x = p.x;
        y = p.y;
    }
    void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }

  
    public static void main(String[] args) {
        Point p1 = new Point();          // default
        Point p2 = new Point(2, 3);      // parameterized
        Point p3 = new Point(p2);        // copy

        p1.display();
        p2.display();
        p3.display();
    }
}
