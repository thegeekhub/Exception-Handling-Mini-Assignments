package exception_handling_mini_assignment3_3;

import java.util.Scanner;

class NonNumericInputException extends Exception {
    public NonNumericInputException() {
        super("Please input numbers only");
    }
}

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter a number to check if it's a palindrome: ");
            String input = scanner.nextLine();
            
            if (!isNumeric(input)) {
                throw new NonNumericInputException();
            }
            
            int number = Integer.parseInt(input);
            
            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
        } catch (NonNumericInputException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
}
