import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        // Menghapus spasi dan mengubah ke huruf kecil untuk mempermudah perbandingan
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
