package com.temp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntegerToRomanConverterTest {
    @Test
    void shouldConvertUpTo10Integers() throws Exception {

        IntegerToRomanConverter integerToRomanConverter = new IntegerToRomanConverter();
        String result = integerToRomanConverter.convert(8);

        assertEquals("VIII", result);

    }


    @Test
    void shouldConvertUpTo99Integers() throws Exception {

        IntegerToRomanConverter integerToRomanConverter = new IntegerToRomanConverter();

        assertEquals("XXXVI", integerToRomanConverter.convert(36));
        assertEquals("XLII", integerToRomanConverter.convert(42));
        assertEquals("L", integerToRomanConverter.convert(50));
        assertEquals("XCIX", integerToRomanConverter.convert(99));
        assertEquals("XC", integerToRomanConverter.convert(90));
    }


    @Test
    void shouldConvertUpTo999Integers() throws Exception {

        IntegerToRomanConverter integerToRomanConverter = new IntegerToRomanConverter();

        assertEquals("CXXV", integerToRomanConverter.convert(125));
        assertEquals("CLXXXVIII", integerToRomanConverter.convert(188));
        assertEquals("DCCCXXXII", integerToRomanConverter.convert(832));
        assertEquals("DCCCLXXXVIII", integerToRomanConverter.convert(888));
        assertEquals("CMXLV", integerToRomanConverter.convert(945));
    }

    @Test
    void shouldConvertUpTo3999Integers() throws Exception {

        IntegerToRomanConverter integerToRomanConverter = new IntegerToRomanConverter();

        assertEquals("MMDLXXXII", integerToRomanConverter.convert(2582));
        assertEquals("MMMDCCCXX", integerToRomanConverter.convert(3820));
        assertEquals("MMMCMXCII", integerToRomanConverter.convert(3992));
    }

    @Test
    void shouldThrowExceptionOnNumbersOutsideOfRange1to3999() {
        IntegerToRomanConverter integerToRomanConverter = new IntegerToRomanConverter();

        assertThrows(InvalidNumber.class, () -> {
            integerToRomanConverter.convert(0);
        });
        assertThrows(InvalidNumber.class, () -> {
            integerToRomanConverter.convert(4000);
        });
        assertThrows(InvalidNumber.class, () -> {
            integerToRomanConverter.convert(5213);
        });

    }
}
