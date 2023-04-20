import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WorkWithFiles {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter writer = new FileWriter("file.txt");
            writer.write("Dieu Bo,\nI miss you so much!");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File file = new File("file.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            String text = scanner.nextLine();
            System.out.println(text);
        }
        scanner.close();

        System.out.println("---------------------------");

        System.out.println("File name: "+ file.getName());
        System.out.println("path: "+ file.getAbsolutePath());
        System.out.println("File size: "+ file.length());

        file.delete();

    }
}
