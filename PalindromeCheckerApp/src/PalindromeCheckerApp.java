import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeCheckerApp {


    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" Deque-Based Palindrome Checker App ");
        System.out.println("======================================");

        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        boolean result = checkPalindrome(input);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }


    private static boolean checkPalindrome(String s) {

        Deque<Character> deque = new LinkedList<>();

        // Add all characters to deque
        for (char ch : s.toCharArray()) {
            deque.addLast(ch);
        }

        // Compare front and rear characters
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}