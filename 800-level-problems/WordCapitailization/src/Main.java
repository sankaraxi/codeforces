import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

//        String output = "";
        //        Use StringBuilder instead — it's optimized for this kind of incremental string building
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (i == 0){
//                output += Character.toUpperCase(input.charAt(i));
                output.append(Character.toUpperCase(input.charAt(i)));
            }else {
//                output += input.charAt(i);
                output.append(input.charAt(i));
            }
        }

        System.out.println(output);
    }
}

//Time Complexity: O(n)
//Space Complexity:O(n)