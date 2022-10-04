package at.ac.fhcampuswien.marks.view;

import java.util.List;

public class MarkDisplay {
    public void printMark(int markNumber) {
        System.out.print("Mark " + (markNumber + 1) + ": ");
    }

    public void printInvalidMark() {
        System.out.print("Invalid mark!\n");
    }

    public void printAverage(double average) {
        System.out.printf("Average: %.2f\n", average);
    }

    public void printNegativeMarks(List<Integer> marks) {
        long negativeMarkCount = marks.stream().filter(mark -> mark == 5).count();
        System.out.print("Negative marks: " + negativeMarkCount + "\n");
    }

    public void printNoMarks() {
        System.out.print("Average: 0.00\nNegative marks: 0\n");
    }
}
