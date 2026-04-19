import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = sc.nextDouble();

        // Conversion
        double weightKg = pounds * 0.45359237;
        double heightM = inches * 0.0254;

        // BMI calculation
        double bmi = weightKg / (heightM * heightM);

        // Output
        System.out.printf("Your BMI is: %.2f", bmi);

        sc.close();
    }
}
