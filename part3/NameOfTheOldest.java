
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0;
        String name = "";
        while (true) {
            String profile = scanner.nextLine();
            if (profile.equals("")) {
                break;
            }
            String[] word = profile.split(",");
            if (oldestAge < Integer.valueOf(word[1])) {
                oldestAge = Integer.valueOf(word[1]);
                name = word[0]; 
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
