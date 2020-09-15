
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points[0-100]:");
        int integer = Integer.valueOf(scan.nextLine());
        if (integer < 0) {
            System.out.println("Grade: impossible!");
        } else if (integer <= 49) {
            System.out.println("Grade: failed");
        } else if (integer <= 59) {
            System.out.println("Grade: 1");
        } else if (integer <= 69) {
            System.out.println("Grade: 2");
        } else if (integer <= 79) {
            System.out.println("Grade: 3");
        } else if (integer <= 89) {
            System.out.println("Grade: 4");
        } else if (integer <= 100) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("incredible!");
        }

    }
}
