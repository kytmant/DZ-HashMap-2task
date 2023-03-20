import java.util.Scanner;

public class Main {
    public static String word = "";

    public static void main(String[] args) {
        WordChecker text = new WordChecker();
        Scanner scanner = new Scanner(System.in);

        while (!word.equals("end")) {
            word = scanner.nextLine();
            System.out.println(text.WordChecker("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."));
        }
    }
}