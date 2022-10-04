package at.ac.fhcampuswien.rhombus.view;

public class RhombusDisplay {
    //TODO
    public void showRhombus(char character) {

    }

    public String getSpaces(int countOfSpaces) {
        String result = "";
        for (int space = 0; space < countOfSpaces; space++) {
            result += " ";
        }
        return result;
    }

    public char getSign(char initialSign, int offset) {
        return (char) (initialSign - offset);
    }

    public void showInvalidNumber() {
        System.out.print("Invalid number!\n");
    }

    public void showHeightInput() {
        System.out.print("h: ");
    }

    public void showCharacterInput() {
        System.out.print("c: ");
    }
}
