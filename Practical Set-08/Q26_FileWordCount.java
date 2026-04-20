import java.io.*;

public class FileCount {
    public static void main(String[] args) {
        int chars = 0, words = 0, lines = 0;

        try {
            FileReader fr = new FileReader(args[0]);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                lines++;

                chars += line.length();

                String[] w = line.split("\\s+");
                words += w.length;
            }

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + chars);

            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
