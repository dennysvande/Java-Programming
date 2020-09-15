
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.equals("")){
                break;
            }
            String[] word = sentence.split(" ");
            for (int i = 0; i < word.length; i++) {
                System.out.println(word[i]);
            }
        }
    }
}
