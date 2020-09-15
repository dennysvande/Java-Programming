
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int integer = Integer.valueOf(scanner.nextLine());
            if (integer < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else if (integer == 0) {
                break;
            }
            System.out.println(integer * integer);
        }

    }
}
