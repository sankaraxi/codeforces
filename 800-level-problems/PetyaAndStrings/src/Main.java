import java.util.Scanner;
//https://codeforces.com/problemset/problem/112/A
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.next();
        String secondString = scanner.next();

        int i = 0;
        int j = 0;

        while(i < firstString.length()){
            char a = Character.toLowerCase(firstString.charAt(i));
            char b = Character.toLowerCase(secondString.charAt(j));
            if (a < b) {
                System.out.println("-1");
                break;
            } else if(a > b){
                System.out.println("1");
                break;
            }
            i++;
            j++;
            if (i == firstString.length()){
                System.out.println("0");
                break;
            }
        }

    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)