import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int x = scanner.nextInt();

            // Convert x to a set of digits
            Set<Character> xDigits = new HashSet<>();
            for (char c : String.valueOf(x).toCharArray()) {
                xDigits.add(c);
            }

            // Try digits 0 to 9 and find the smallest y such that x and y share a digit
            for (int y = 0; y <= 9; y++) {
                if (xDigits.contains((char)(y + '0'))) {
                    System.out.println(y);
                    break;
                }
            }
        }

        scanner.close();
    }
}
