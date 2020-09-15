
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int counter = 0;
        double average = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number > 0) {
                sum += number;
                counter++;
            }
            if (number == 0){
                average = sum / counter;
                if (counter == 0) {
                    System.out.println("Cannot calculate the average");
                } else {
                    System.out.println(average);
                }
                break;
            }
        }

    }
}
