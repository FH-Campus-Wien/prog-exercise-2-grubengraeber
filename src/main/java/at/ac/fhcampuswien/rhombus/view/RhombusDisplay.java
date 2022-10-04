package at.ac.fhcampuswien.rhombus.view;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RhombusDisplay {
    //TODO
    public void showRhombus(char sign, int size) {
        String pyramid = getPyramid(size/2 + 1, sign);
        String reversedPyramid = getReversedPyramid(size/2, sign);
        System.out.print(pyramid + reversedPyramid);
    }

    private String getRightCharacters(char initialCharacter, int numberOfCharacters) {
        List<Character> characters = new ArrayList<>();
        int outerNumberIndex = numberOfCharacters / 2;
        for (int character = 0; character < numberOfCharacters; character++) {
            char signToAdd = getSign(initialCharacter, outerNumberIndex);
            characters.add(signToAdd);
            outerNumberIndex--;
        }
        return characters.stream().map(String::valueOf).collect(Collectors.joining());
    }

    private String getPyramid(int pyramidSize, char sign) {
        String pyramid = "";
        int characterCount = 1;
        for (int row = 0; row < pyramidSize; row++) {
            String spaces = getSpaces(pyramidSize/2 - row + 1);
            String rowCharacters = getRightCharacters(sign, characterCount);
            pyramid += spaces;
            pyramid += rowCharacters;
            pyramid += "\n";
            characterCount += 2;
        }
        return pyramid;
    }

    private String getReversedPyramid(int size, char sign) {
        String reversedPyramid = "";
        int characterCount = size + 1;
        for (int row = size; row > 0; row--) {
            String spaces = getSpaces(size - row + 1);
            String characters = getRightCharacters(sign, characterCount);
            reversedPyramid += spaces;
            reversedPyramid += characters;
            reversedPyramid += "\n";
            characterCount -= 2;
        }
        return reversedPyramid;
    }

    public String getSpaces(int countOfSpaces) {
        String result = "";
        for (int space = 0; space < countOfSpaces; space++) {
            result += " ";
        }
        return result;
    }

    public char getSign(char initialSign, int offset) {
        return offset > 0 ? (char) (initialSign - offset) : (char) (initialSign + offset);
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
