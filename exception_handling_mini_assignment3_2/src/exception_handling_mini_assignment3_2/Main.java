package exception_handling_mini_assignment3_2;

import java.util.Scanner;

class OutputBelowThresholdException extends Exception {
    public OutputBelowThresholdException() {
        super("Output is below 2X of initial value");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the initial value (e.g., 100000): ");
            double initialValue = scanner.nextDouble();
            
            System.out.print("Enter the percentage change (e.g., 30 for 30%): ");
            double percentageChange = scanner.nextDouble();
            
            double currentValue = initialValue;
            
            for (int i = 0; i < 2; i++) {
                currentValue = currentValue + (currentValue * (percentageChange / 100));
            }
            
            if (currentValue < (2 * initialValue)) {
                throw new OutputBelowThresholdException();
            } else {
                System.out.println("Output is: " + currentValue);
            }
        } catch (OutputBelowThresholdException e) {
            System.out.println(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numeric values.");
        }
        
        scanner.close();
    }
}
