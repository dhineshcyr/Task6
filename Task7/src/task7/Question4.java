package task7;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        File file = new File("nonexistent.txt");
        
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}
//output
//Error: File not found.

