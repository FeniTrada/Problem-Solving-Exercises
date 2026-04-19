import java.io.*;

public class StudentFile {
    public static void main(String[] args) {

        try {
            // Write to file
            FileWriter fw = new FileWriter("students.txt");
            fw.write("1 Disha 85\n");
            fw.write("2 Rahul 78\n");
            fw.write("3 Priya 90\n");
            fw.close();

            // Read from file
            FileReader fr = new FileReader("students.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("Student Records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        } finally {
            System.out.println("File operation completed");
        }
    }
}
