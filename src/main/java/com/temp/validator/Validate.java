package com.temp.validator;

import java.util.regex.Pattern;

public class Validate {
    public static boolean isValidInput(String inputString) {
        final String ONLY_CHARACTER_REGEX = "([A-Za-z])";
        final String WHITE_SPACE = "\\s";
        Pattern onlyCharactersPattern = Pattern.compile(ONLY_CHARACTER_REGEX);
        Pattern isWhiteSpace = Pattern.compile(WHITE_SPACE);

        if (inputString.isEmpty()) return false;
        if (!onlyCharactersPattern.matcher(inputString).find()) return false;
        return !isWhiteSpace.matcher(inputString).find();
    }
}
