package com.day2problem.homework;

public class ForSumIntegerNumberP1 {
    public static void main(String[] args) {
        int i, num = 7, sum = 0;

        for(i = 1; i <= num; ++i)
        {
            sum = sum + i;
        }
        System.out.println("Sum of the Natural Numbers is = " + sum);
    }
}

