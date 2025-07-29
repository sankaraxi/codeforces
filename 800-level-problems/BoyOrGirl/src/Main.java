//https://codeforces.com/problemset/problem/236/A

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // This set will ignore the duplicate characters.

        HashSet<Character> uniqueElements = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            uniqueElements.add(input.charAt(i));
        }

        if (uniqueElements.size()%2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}