package at.ac.fhcampuswien.marks.controller;

import java.util.Scanner;

public class MarkInput {

    private final Scanner scanner;
    public MarkInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getNextMark() {
        return scanner.nextInt();
    }
}
