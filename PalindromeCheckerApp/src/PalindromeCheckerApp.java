import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeCheckerApp {


    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" Linked List Based Palindrome Checker ");
        System.out.println("==========================================");

        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        boolean result = isPalindrome(input);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }

    private static boolean isPalindrome(String str) {

        LinkedList<Character> list = new LinkedList<>();

        // Add characters to linked list
        for (char ch : str.toCharArray()) {
            list.add(ch);
        }

        // Compare from both ends
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                return false;
            }
        }

        return true;
    }
}

