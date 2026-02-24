import java.util.Scanner;

public class PalindromeCheckerApp {
    static void main() {
        System.out.println("======================================");
        System.out.println(" Palindrome Check Using String Reverse ");
        System.out.println("======================================");

        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        String reversed = reverseString(input);

        boolean isPalindrome = input.equals(reversed);

        System.out.println("Reversed : " + reversed);
        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }

    private static String reverseString(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }
}


