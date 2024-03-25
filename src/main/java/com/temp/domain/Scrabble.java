package com.temp.domain;

import com.temp.validator.Validate;

public class Scrabble {
    public static int calculateScore(String inputString) throws Exception {
        if (!Validate.isValidInput(inputString)) throw new Exception();
        int score = 0;
        for (char c : inputString.toUpperCase().toCharArray()) {
            switch (c) {
                case 'E':
                case 'A':
                case 'I':
                case 'O':
                case 'N':
                case 'R':
                case 'T':
                case 'L':
                case 'S':
                case 'U':
                    score += 1;
                    break;
                case 'D':
                case 'G':
                    score += 2;
                    break;
                case 'B':
                case 'C':
                case 'M':
                case 'P':
                    score += 3;
                    break;
                case 'F':
                case 'H':
                case 'V':
                case 'W':
                case 'Y':
                    score += 4;
                    break;
                case 'K':
                    score += 5;
                    break;
                case 'J':
                case 'X':
                    score += 8;
                    break;
                case 'Q':
                case 'Z':
                    score += 10;
                    break;
                default:
                    score += 0;
                    break;
            }
        }
        return score;
    }

    ;
}
