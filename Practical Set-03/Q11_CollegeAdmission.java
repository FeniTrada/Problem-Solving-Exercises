import java.util.Scanner;

class College {
    String collegeName;

    College(String name) {
        collegeName = name;
    }

    class Admission {
        String studentName;
        String course;

        void input() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter student name: ");
            studentName = sc.nextLine();

            System.out.print("Enter course: ");
            course = sc.nextLine();
        }

        void display() {
            System.out.println("College: " + collegeName);
            System.out.println("Student: " + studentName);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {
        College c = new College("SSASIT");

        // Create inner class object
        College.Admission a = c.new Admission();

        a.input();
        a.display();
    }
}
