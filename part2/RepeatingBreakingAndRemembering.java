
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0, counter = 0, even = 0, odd = 0;
        double average = 0;
        while (true) {
            int integer = Integer.valueOf(scanner.nextLine());
            if (integer % 2 == 0 && integer != -1) {
                even++;
                sum += integer;
            }
            if (integer % 2 != 0 && integer != -1) {
                odd++;
                sum += integer;
            }
            counter++;
            if (integer == -1) {
                counter--;
                average = (double) sum / (double) counter;
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + counter);
                System.out.println("Average: " + average);
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;
            }
        }

    }
}
