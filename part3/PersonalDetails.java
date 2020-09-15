
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int sum = 0, counter = 0;
        double average = 0;
        
        while (true) {
            String profile = scanner.nextLine();
            if (profile.equals("")) {
                break;
            }
            String[] part = profile.split(",");
            if (longestName.length() < part[0].length()) {
                longestName = part[0];
            } 
            sum += Integer.valueOf(part[1]);
            counter++;
        }
        System.out.println(counter);
        average = 1.0 * sum / counter;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
