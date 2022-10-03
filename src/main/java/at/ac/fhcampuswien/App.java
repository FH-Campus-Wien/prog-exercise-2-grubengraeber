package at.ac.fhcampuswien;

import java.util.*;

public class App {

    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }

    public void largestNumber() {
        boolean notNegativeOrZero = true;
        int counter = 1;
        List<Double> storedNumbers = new ArrayList<>();
        while (notNegativeOrZero) {
            System.out.print("Number " + counter + ": ");
            double inputNumber = scanner.nextDouble();
            if (inputNumber <= 0) {
                if (storedNumbers.isEmpty()) {
                    System.out.print("No number entered." + "\n");
                }
                else {
                    double largestNumber = Collections.max(storedNumbers);
                    System.out.printf("The largest number is %.2f\n", largestNumber);
                }
                notNegativeOrZero = false;
            }
            storedNumbers.add(inputNumber);
            counter++;
        }
    }

    public void stairs() {
        System.out.print("n: ");
        int ROWS = scanner.nextInt();
        int counter = 1;
        if (ROWS <= 0) {
            System.out.println("Invalid number!");
        } else {
            int numbersInRow = 1;
            for (int row = 0; row < ROWS; row++) {
                for (int column = 0; column < numbersInRow; column++) {
                    System.out.print(counter + " ");
                    counter++;
                }
                numbersInRow++;
                System.out.println();
            }
        }
        
    }

    public void printPyramid() {
        final int ROWS = 6;
        int asterisksCount = 1;
        String rowString = "";

        for (int row = 0; row < ROWS; row++) {
            for (int space = 0; space < ROWS - row - 1; space++) {
                rowString += " ";
            }
            for (int asterisks = 0; asterisks < asterisksCount; asterisks++) {
                rowString += "*";
            }
            asterisksCount += 2;
            System.out.println(rowString);
            rowString = "";
        }
    }

    //todo Task 4
    public void printRhombus() {
        // input your solution here
    }

    //todo Task 5
    public void marks() {
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers() {
        // input your solution here
    }
}