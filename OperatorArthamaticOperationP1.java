package com.day2problem.homework;

public class OperatorArthamaticOperationP1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int value1 = a+b*c;
        int value2 = c+a/b;
        int value3 = a%b+c;
        int value4 = a*b+c;

        System.out.println("values are : "+value1+", "+value2+" ,"+value3+", "+value4);
        int max=0;

        if(value1>value2 && value1>value3 && value1>value4) {
            max = value1;
        }else if(value2>value1 && value2>value3 && value2>value4) {
            max = value2;
        }else if(value3>value2 && value3>value1 && value3>value4) {
            max = value3;
        }else {
            max = value4;
        }
        System.out.println("Maximum value : "+ max);

        int min = 0;

        if(value1<value2 && value1<value3 && value1<value4) {
            min = value1;
        }else if(value2<value1 && value2<value3 && value2<value4) {
            min = value2;
        }else if(value3<value2 && value3<value1 && value3<value4) {
            min = value3;
        }else {
            min = value4;
        }
        System.out.println("Minimum value : "+ min);
    }
}
