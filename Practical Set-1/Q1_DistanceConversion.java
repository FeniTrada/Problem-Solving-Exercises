/*
Practical Set-1
Question No: 1
Title: Distance Conversion (meters to feet)
*/

import java.util.Scanner;

public class Q1_DistanceConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();

        double feet = meters * 3.28084;

        System.out.printf("Distance in feet = %.2f\n", feet);

        sc.close();
    }
}
