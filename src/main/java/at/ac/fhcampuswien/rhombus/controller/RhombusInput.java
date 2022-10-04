package at.ac.fhcampuswien.rhombus.controller;

import java.util.Scanner;

public class RhombusInput {

    private final Scanner scanner;

    public RhombusInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getHeight() {
        return scanner.nextInt();
    }

    public char getCharacter() {
        return scanner.next().charAt(0);
    }
}
