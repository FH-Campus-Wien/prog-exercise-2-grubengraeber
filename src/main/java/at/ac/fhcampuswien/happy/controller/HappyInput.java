package at.ac.fhcampuswien.happy.controller;

import java.util.Scanner;

public class HappyInput {
    private final Scanner scanner;
    public HappyInput(Scanner scanner) {

        this.scanner = scanner;
    }

    public int getNumber() {
        return scanner.nextInt();
    }
}
