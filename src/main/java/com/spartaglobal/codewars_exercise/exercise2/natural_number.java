package com.spartaglobal.codewars_exercise.exercise2;

public class natural_number {
    // If we list all the natural numbers below 10 that are multiples of 3 or 5,
// we get 3, 5, 6 and 9. The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.
    public int natural(){
        int sum = 0, t = 1000;
        for (int i = 0; i < t; i++){
            if ((i % 3 == 0 || i % 5 == 0))
                sum += i;
        }
        System.out.println(sum);
        return sum;
    }
}