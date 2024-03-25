package com.temp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ScrabbleManagerTest {
    @Test
    void shouldCalculateScore() throws Exception {
        // Arrange
        String inputString = "GUARDIAN";
        int expectedResult = 10;
        //Act
        ScrabbleManager scrabbleManager = new ScrabbleManager();
        int actualResult = scrabbleManager.calculateScore(inputString);
        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void shouldReturnExceptionOnInvalidString() {
        //Arrange
        String emptyInputString = "";
        //Act
        ScrabbleManager scrabbleManager = new ScrabbleManager();
        //Assert
        assertThrows(Exception.class, () -> {
            scrabbleManager.calculateScore(emptyInputString);
        });
        assertThrows(Exception.class, () -> {
            scrabbleManager.calculateScore("123");
        });
        assertThrows(Exception.class, () -> {
            scrabbleManager.calculateScore("empty InputString");
        });
    }
}
