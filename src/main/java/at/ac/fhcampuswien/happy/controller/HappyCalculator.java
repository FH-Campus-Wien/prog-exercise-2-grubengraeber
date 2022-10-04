package at.ac.fhcampuswien.happy.controller;

public class HappyCalculator {
    public int getNextNumber(int number) {
        String numberString = String.valueOf(number);
        String[] numberStringArray = numberString.split("");
        int newNumber = 0;
        for (String numberToCompute : numberStringArray) {
            newNumber += Integer.parseInt(numberToCompute) * Integer.parseInt(numberToCompute);
        }
        return newNumber;
    }
}
