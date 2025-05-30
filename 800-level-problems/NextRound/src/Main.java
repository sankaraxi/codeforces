import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Input
        Scanner input = new Scanner(System.in);
        String lineOne = input.nextLine();
        String[] partsOne = lineOne.split(" ");

        int n = Integer.parseInt(partsOne[0]);
        int k = Integer.parseInt(partsOne[1]);

        String lineTwo = input.nextLine();
        String[] partsTwo = lineTwo.split(" ");

        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(partsTwo[i]);
        }

        input.close();

        //Output and Logic
        int kthScore = data[k - 1];
        int result = 0;
        for (int i = 0; i < n; i++) {
            if(data[i] >= kthScore && data[i] > 0 ){
                result++;
            }
        }
        System.out.println(result);
    }
}