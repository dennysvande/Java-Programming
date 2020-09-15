
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while (true) {
            String profile = scanner.nextLine();
            if (profile.equals("")) {
                break;
            }
            String[] part = profile.split(",");
            if (oldest < Integer.valueOf(part[1])){
                oldest = Integer.valueOf(part[1]); 
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
