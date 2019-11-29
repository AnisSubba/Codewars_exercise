package com.spartaglobal.codewars_exercise.exercise4;

import java.util.Arrays;

public class descending_order {
    /*Your task is to make a function that can take any non-negative integer as a argument
     and return it with its digits in descending order. Essentially, rearrange the digits to
     create the highest possible number.*/

    public static int sortDesc(final int num) {
        char[] tempArray = String.valueOf(num).toCharArray();
        Arrays.sort(tempArray);
        return Integer.parseInt(new StringBuilder(new String(tempArray)).reverse().toString());
    }
}
