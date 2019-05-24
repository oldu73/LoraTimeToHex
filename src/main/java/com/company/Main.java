package com.company;

import static com.company.Converter.timeStringToHexStringConcat;

public class Main {

    public static void main(String[] args) {

        //TODO ask PM for...
        //Q1: - 0000 vs 2400 for midnight?
        //Q2: - are whatever minutes authorized or limited to multiple of quarter?
        //Q3: - does 0 means not set?

        // = 7B8C909498A0C020406070
        String timeHexString = timeStringToHexStringConcat("1730", "1800", "1830", "1900", "2000", "0000", "0400", "0800", "1200", "1400");

        System.out.println(timeHexString);
    }
}
