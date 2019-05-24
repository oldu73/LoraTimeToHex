package com.company;

import org.junit.jupiter.api.Test;

import static com.company.Converter.timeStringToHexStringConcat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Olivier Durand on 25.05.2019.
 */
class ConverterTest {

    @Test
    public void miscMinutes() { assertEquals("7B8C90949CA2C40B416070", timeStringToHexStringConcat("1730", "1800", "1830", "1930", "2015", "0030", "0125", "0810", "1207", "1400")); }

    @Test
    public void smallParamList() { assertEquals("7B8C90949CA2", timeStringToHexStringConcat("1730", "1800", "1830", "1930", "2015")); }

    @Test
    public void withZeroesParamList() { assertEquals("7B8C909400000000000000", timeStringToHexStringConcat("1730", "1800", "1830", "0", "0", "0", "0", "0", "0", "0")); }

    @Test
    public void stdParamList() { assertEquals("7B8C909498A0C020406070", timeStringToHexStringConcat("1730", "1800", "1830", "1900", "2000", "0000", "0400", "0800", "1200", "1400")); }

    @Test
    public void midnightVsMidnight() { assertEquals("7B8C909498A0C020C06070", timeStringToHexStringConcat("1730", "1800", "1830", "1900", "2000", "0000", "0400", "2400", "1200", "1400")); }

}
