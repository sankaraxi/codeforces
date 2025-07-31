import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();  // Number of stones
        String s = scanner.next();  // Colors of the stones

        int count = 0;

        // Loop through string, comparing current and next character
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
