import java.io.IOException;
import java.util.*;
public class Main {
    private static final  Words words = new Words();
    private static final Scanner sc = new Scanner(System.in);

    public static void drawMenu() throws IOException {
        int n;
        do {
            System.out.println("Welcome to the Word Generator");
            System.out.println("1. Add Word");
            System.out.println("2. Searching word by word");
            System.out.println("3. Searching meaning by word");
            System.out.println("4. Display word");
            System.out.println("5. Exit");
            n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                    words.SetWord();
                    break;
                case 2:
                    words.CheckWord();
                    break;
                case 3:
                    words.FindMeaning();
                    break;
                case 4:
                    words.DisplayDictionary();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option!");
            }
        } while (n!=5);
    }
    public static void main(String[] args) throws IOException {
        drawMenu();
    }
}
