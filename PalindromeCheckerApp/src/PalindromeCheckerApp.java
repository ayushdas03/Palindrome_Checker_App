import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println(" Queue + Stack Palindrome Checker ");
        System.out.println("======================================");

        System.out.print("Input : ");
        String input = sc.nextLine();

        boolean result = checkPalindrome(input);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }

    private static boolean checkPalindrome(String str) {

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Add characters to both stack and queue
        for (char ch : str.toCharArray()) {
            stack.push(ch);
            queue.add(ch);
        }

        // Compare elements
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                return false;
            }
        }

        return true;
    }
}
