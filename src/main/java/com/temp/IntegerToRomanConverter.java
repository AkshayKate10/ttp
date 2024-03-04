package com.temp;

public class IntegerToRomanConverter {

    public String convert(int iiOriginalNumber) throws InvalidNumber {
        if (iiOriginalNumber < 1 || iiOriginalNumber > 3999) {
            throw new InvalidNumber();
        }
        String[] asUnitPlace = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] asTenthPlace = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] asHundredthPlace = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] asThousandPlace = {"", "M", "MM", "MMM"};

        return asThousandPlace[iiOriginalNumber / 1000] + asHundredthPlace[(iiOriginalNumber % 1000) / 100] + asTenthPlace[(iiOriginalNumber % 100) / 10] + asUnitPlace[iiOriginalNumber % 10];
    }
}
