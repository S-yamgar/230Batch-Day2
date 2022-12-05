package com.day2problem.homework;

import java.util.Scanner;

public class WhileSumNumberP1 {
         static int num;
     public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
            num = obj.nextInt();
                System.out.println("Enter natural numbers is : ");
                    int a = 1;
                    int sum = 0;

                    while(a <= num){
                    sum = sum + a;
                     a++;
                    }
                    System.out.println("Sum of natural numbers : " + sum );
    }
}
