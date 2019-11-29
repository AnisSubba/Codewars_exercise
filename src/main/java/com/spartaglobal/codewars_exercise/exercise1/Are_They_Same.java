package com.spartaglobal.codewars_exercise.exercise1;

/*Given two arrays a and b write a function comp(a, b) (compSame(a, b) in Clojure) that checks
whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, here,
that the elements in b are the elements in a squared, regardless of the order.*/

import java.util.Arrays;

public class Are_They_Same {
    public static boolean comp(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i]*a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
