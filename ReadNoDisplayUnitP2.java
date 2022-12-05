package com.day2problem.homework;
import java.util.Scanner;
    public class ReadNoDisplayUnitP2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int thousand = 0;
            int hundreds = 0;
            int tens = 0;
            int units = 0;

            System.out.println("Enter 4 digit number is : ");
            int number = input.nextInt();
            if(number <=9999 && number>999){
                thousand = number / 1000;
                System.out.println("Thousand place digit number is : " + thousand);
                hundreds = (number / 100) % 10;
                System.out.println("Hundreds place digit number is : " + hundreds);

                tens = (number / 10) % 10;
                System.out.println("Tens place digit number is : " + tens);
                units = (number % 10);
                System.out.println("Units place dight number is : " + units);
            } else {
                if (number > 9999)
                    System.out.println("Please enter valid digits number");
                if (number < 1000)
                    System.out.println("please Enter 4 digit valid number number");
           }
        }
}
