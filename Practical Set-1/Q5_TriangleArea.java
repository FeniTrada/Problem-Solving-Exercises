import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sides
        System.out.print("Enter three sides: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Check if valid triangle
        if (a + b > c && a + c > b && b + c > a) {

            // Calculate semi-perimeter
            double s = (a + b + c) / 2;

            // Heron's formula
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            // Output
            System.out.printf("Area of triangle: %.2f", area);

        } else {
            System.out.println("Invalid triangle sides!");
        }

        sc.close();
    }
}
