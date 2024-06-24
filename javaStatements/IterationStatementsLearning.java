package javaStatements;

public class IterationStatementsLearning {

    public static void main(String[] args) {
        // Example using for loop
        System.out.println("For loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // Example using while loop
        System.out.println("\nWhile loop:");
        int count = 0;
        while (count < 5) {
            System.out.println("Iteration: " + count);
            count++;
        }

        // Example using do-while loop
        System.out.println("\nDo-While loop:");
        int index = 0;
        do {
            System.out.println("Iteration: " + index);
            index++;
        } while (index < 5);
    }

}
