package at.ac.fhcampuswien.rhombus.controller;

public class RhombusValidator {
    public boolean validateHeight(int height) {
        return height % 2 != 0;
    }
}
