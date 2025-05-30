import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Input
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] parts = line.split(" ");

        int m = Integer.parseInt(parts[0]);
        int n = Integer.parseInt(parts[1]);

        input.close();

        //Output and Logic

        int total_squares = m * n;

        System.out.println(total_squares/2);
    }
}