package com.emorgan.components.sevenDisplay;

import com.emorgan.components.sevenDisplay.model.Result;

public class SevenDisplay {

    String[] dict1 = new String[]{" _ ", " ", " _ ", "_ ", "   ", " _ ", " _ ", "_ ", " _ ", " _ "};
    String[] dict2 = new String[]{"| |", "|", " _|", "_|", "|_|", "|_ ", "|_ ", " |", "|_|", "|_|"};
    String[] dict3 = new String[]{"|_|", "|", "|_ ", "_|", "  |", " _|", "|_|", " |", "|_|", " _|"};

    public SevenDisplay() {

    }

    public Result construct(Integer number) {
        assert number >= 0 : "Number must be positive";

        StringBuilder line1 = new StringBuilder();
        StringBuilder line2 = new StringBuilder();
        StringBuilder line3 = new StringBuilder();

        for (Integer digit : Integer.toString(number).chars().map(c -> c - '0').toArray()) {
            line1.append(dict1[digit]).append(" ");
            line2.append(dict2[digit]).append(" ");
            line3.append(dict3[digit]).append(" ");
        }

        return new Result(line1.toString(), line2.toString(), line3.toString());

    }
}
