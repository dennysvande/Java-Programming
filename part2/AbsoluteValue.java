
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = Integer.valueOf(scanner.nextLine());
        if (integer < 0) {
            System.out.println(-1 * integer);
        } else {
            System.out.println(integer);
        }

    }
}
