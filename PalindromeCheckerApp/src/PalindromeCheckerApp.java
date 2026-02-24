import java.util.Scanner;

public class PalindromeCheckerApp {
    static void main() {
        System.out.println(" Character Array Based Palindrome Check ");
        System.out.println("======================================");

        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        boolean result = isPalindrome(input);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }

    /**
     * Checks palindrome using character array comparison.
     *
     * @param s Input string
     * @return true if palindrome, otherwise false
     */
    private static boolean isPalindrome(String s) {

        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

