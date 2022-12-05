package com.day2problem.homework;

import java.util.Scanner;

public class ForSumOfReverseNumberP2 {
        public static void main(String[] args) {
            System.out.println("Enter the number : ");
                int number;
                int reverse = 0;
            Scanner obj = new Scanner(System.in);
                number= obj.nextInt();

               for( ; number != 0; number=number/10) {
                    int remainder = number % 10;
                    reverse = reverse * 10 + remainder;
            }
            System.out.println("Reverse number is: " + reverse);
        }
    }

