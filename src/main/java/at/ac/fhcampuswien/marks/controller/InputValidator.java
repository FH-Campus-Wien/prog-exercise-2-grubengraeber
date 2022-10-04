package at.ac.fhcampuswien.marks.controller;

public class InputValidator {
    public boolean markIsValid(int input) {
        return input >= 0 && input < 6;
    }

    public boolean markIsZero(int input) {
        return input == 0;
    }
}
