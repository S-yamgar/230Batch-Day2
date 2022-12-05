package com.day2ifelseoperator.homework1;

import java.util.Scanner;

public class OperatorSpringSeasionP2 {
    public static void main(String[] args) {
            int month;
            int day;
        Scanner obj = new Scanner(System.in);
            System.out.println("Enter month no : ");
                month = obj.nextInt();
            System.out.println("Enter Day : ");
                day = obj.nextInt();

        boolean getSpringSeason = (month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 30) || (month == 5 && day >= 1 && day <= 31) || (month == 6 && day >= 1 && day <= 20);
            System.out.println(getSpringSeason);
    }
}
