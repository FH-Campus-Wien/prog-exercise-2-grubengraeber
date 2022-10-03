package at.ac.fhcampuswien;

import java.util.*;

public class App {

    Scanner scanner = new Scanner(System.in);

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

    //todo Task 2
    public void stairs() {
        // input your solution here
    }

    //todo Task 3
    public void printPyramid() {
        // input your solution here
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