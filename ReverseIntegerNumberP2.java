package com.day2problem.homework;

import java.util.Scanner;

public class ReverseIntegerNumberP2 {

        public static void main(String[] args) {
            int number = 0;
            int reverse = 0;
            System.out.println("Enter the number :");
            Scanner obj = new Scanner(System.in);
            number = obj.nextInt();

            {
            while (number != 0) {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number / 10;
            }
            System.out.println("reverse number is : " + reverse);
        }
    }
}
