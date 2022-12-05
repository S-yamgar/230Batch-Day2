package com.day2problem.homework;

import java.util.Scanner;
// palindrome no is 545,121,959
public class ForPalindromeNumberP3 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number is : ");

        int inputNumber = obj.nextInt();

        int reverseNumber = 0, remainder;
        int number = inputNumber;

        while(inputNumber != 0) {
            remainder = inputNumber % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            inputNumber = inputNumber / 10;
        }
        if(number == reverseNumber ) {
            System.out.println(number + " is palindrome number");
        }else {
            System.out.println(number +" is not palindrome number");
        }

    }
}
