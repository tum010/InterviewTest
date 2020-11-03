package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String input = "applecream";
        String[] dataDict = {"apple", "pie", "banana", "cream"};
        ArrayList<String> foundString = new ArrayList<String>();
        for (int i = 0; i <= dataDict.length - 1; i++) {
            if (input.contains(dataDict[i])) {
                foundString.add(dataDict[i]);
            }
        }
        if (!foundString.isEmpty())
            System.out.println("Found String " + foundString);
        else
            System.out.println("not found ");
    }
}
