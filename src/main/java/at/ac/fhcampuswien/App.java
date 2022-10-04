package at.ac.fhcampuswien;

import at.ac.fhcampuswien.happy.controller.HappyCalculator;
import at.ac.fhcampuswien.happy.controller.HappyInput;
import at.ac.fhcampuswien.happy.view.HappyDisplay;
import at.ac.fhcampuswien.marks.controller.InputValidator;
import at.ac.fhcampuswien.marks.controller.MarkInput;
import at.ac.fhcampuswien.marks.view.MarkDisplay;
import at.ac.fhcampuswien.rhombus.controller.RhombusInput;
import at.ac.fhcampuswien.rhombus.controller.RhombusValidator;
import at.ac.fhcampuswien.rhombus.view.RhombusDisplay;

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
                } else {
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
        RhombusInput rhombusInput = new RhombusInput(scanner);
        RhombusDisplay rhombusDisplay = new RhombusDisplay();
        RhombusValidator rhombusValidator = new RhombusValidator();
        rhombusDisplay.showHeightInput();
        int height = rhombusInput.getHeight();
        rhombusDisplay.showCharacterInput();
        char character = rhombusInput.getCharacter();
        boolean heightIsValid = rhombusValidator.validateHeight(height);
        if (heightIsValid) {
            rhombusDisplay.showRhombus(character);
        } else {
            rhombusDisplay.showInvalidNumber();
        }
    }

    //todo Task 5
    public void marks() {
        List<Integer> marks = new ArrayList<>();
        MarkInput markInput = new MarkInput(scanner);
        InputValidator inputValidator = new InputValidator();
        MarkDisplay markDisplay = new MarkDisplay();

        while (true) {
            markDisplay.printMark(marks.size());
            int input = markInput.getNextMark();
            if (!inputValidator.markIsValid(input)) {
                markDisplay.printInvalidMark();
                continue;
            }
            if (inputValidator.markIsZero(input)) {
                break;
            }
            marks.add(input);
        }
        OptionalDouble optionalResult = marks.stream().mapToInt(Integer::intValue).average();
        if (optionalResult.isPresent()) {
            markDisplay.printAverage(optionalResult.getAsDouble());
            markDisplay.printNegativeMarks(marks);
            return;
        }
        markDisplay.printNoMarks();

    }

    //todo Task 6
    public void happyNumbers() {
        HappyInput happyInput = new HappyInput(scanner);
        HappyCalculator happyCalculator = new HappyCalculator();
        HappyDisplay happyDisplay = new HappyDisplay();

        happyDisplay.sayN();
        int number = happyInput.getNumber();
        while(true) {
            int nextNumber = happyCalculator.getNextNumber(number);
            number = nextNumber;
            if (number == 1) {
                happyDisplay.showHappyNumber();
                break;
            } else if (number == 4) {
                happyDisplay.showSadNumber();
                break;
            }
        }
    }
}