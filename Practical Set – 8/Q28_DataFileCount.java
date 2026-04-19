import java.io.*;

public class DataFileCount {
    public static void main(String[] args) {
        int lines = 0, words = 0, chars = 0;

        try {
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                lines++;

                String[] w = line.split("\\s+");
                words += w.length;

                chars += line.replaceAll("\\s", "").length(); // exclude spaces
            }

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters (no spaces): " + chars);

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Error");
        }
    }
}
