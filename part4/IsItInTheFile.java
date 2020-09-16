
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listName = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner readFile = new Scanner(Paths.get(file))) {
            while (readFile.hasNextLine()) {
                String name = readFile.nextLine();
                listName.add(name);
            }
            
            System.out.println("Search for:");
            String searchedFor = scanner.nextLine();
        
            if (listName.contains(searchedFor)) {
                System.out.println("Found!");
            } else {
             System.out.println("Not Found.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
