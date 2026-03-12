import java.util.Scanner;

                public class PalindroneCheckerApp {
                    public static void main(String[] args) {
                        String str = "level";

                        // Convert string to character array
                        char[] charArray = str.toCharArray();
                        boolean isPalindrone = true;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome: " + isPalindrome);

        sc.close();
    }
}
