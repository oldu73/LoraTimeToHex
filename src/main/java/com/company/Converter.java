package com.company;

/**
 * Created by Olivier Durand on 24.05.2019.
 */
public class Converter {

    public static String timeStringToHexStringConcat(String ...strings) {

        // strings e.g. "1730", "1800", "1830", "1930", "2015", ...
        // midnight could be "0000" either "2400", it doesn't matter!

        String hexString = Integer.toHexString(123).toUpperCase();    // 123 = sequence number

        for (String s: strings)
            hexString = hexString.concat(s.equals("0") ? "00" :
                    String.format("%02X", (int)((((double)Integer.parseInt(s.substring(0, 2).equals("00") ? "24" :
                            s.substring(0, 2)) + (Integer.parseInt(s.substring(2,4)) / 60.0)) * 60.0)/7.5)));

        // hexString e.g. "7B8C90949CA2..."

        return hexString;
    }

}
