import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        int[][] data = new int[n][3];

        for (int i = 0; i < n; i++) {
            String line = input.nextLine();
            String[] parts = line.split(" ");

            for (int j = 0; j < 3; j++) {
                data[i][j] = Integer.parseInt(parts[j]);
            }
        }

        input.close();
        int result = 0;
        for (int i = 0; i < n; i++) {
            int answer = 0;
            for (int j = 0; j < 3; j++) {
                if(data[i][j] == 1){
                    answer++;
                }
            }
            if(answer > 1){
                result++;
            }
        }
        System.out.println(result);
    }
}