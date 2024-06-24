package javaStatements;

public class TransferStatementsLearning {

    public static void main(String[] args) {
        // Example using break statement
        System.out.println("Break statement:");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.println("Iteration: " + i);
        }

        // Example using continue statement
        System.out.println("\nContinue statement:");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip the rest of the loop iteration if i is even
            }
            System.out.println("Iteration: " + i);
        }

        // Example using return statement
        System.out.println("\nReturn statement:");
        printNumbersUpToFive();
    }

    // Method to demonstrate the return statement
    public static void printNumbersUpToFive() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                return; // Exit the method when i is 5
            }
            System.out.println("Number: " + i);
        }
    }

}
