import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Number of statements
        int x = 0; // Initial value of x

        for (int i = 0; i < n; i++) {
            String statement = scanner.next();
            // Check if the statement contains "++"
            if (statement.contains("++")) {
                x++;
            } else {
                x--;
            }
        }

        System.out.println(x);
        scanner.close();
    }
}