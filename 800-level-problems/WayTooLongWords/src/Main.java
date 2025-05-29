import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = input.nextLine();
        }

        for(String word: words){
            int length = word.length();
            int new_length;
            if(length <= 10){
                System.out.println(word);
            }else{
                new_length = length - 2;
                String output = "" + word.charAt(0) + new_length + word.charAt(length-1) ;
                System.out.println(output);
            }
        }
    }
}