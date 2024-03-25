package com.temp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScrabbleManagerTest {
    @Test
    void shouldCalculateScore() {
        String inputString = "GUARDIAN";
        int expectedResult = 10;

        ScrabbleManager scrabbleManager = new ScrabbleManager();
        int actualResult = scrabbleManager.calculateScore(inputString);

        assertEquals(expectedResult, actualResult);

    }
}
