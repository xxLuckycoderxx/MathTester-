package com.LickinHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

    int firstNumber,secondNumber,total;
Scanner keyboard;
String age;
int height ;
double inches;


    firstNumber=5;
    secondNumber=10;
    total=firstNumber+secondNumber;
    System.out.println(total);
    total=firstNumber*25;
    System.out.println(total);
    keyboard=new Scanner(System.in);
    inches=0.024/1;

 // BmI=kg/m*m
        System.out.println("What is your height in inches");
        height=keyboard.nextInt();
        System.out.println(height*inches);
        System.out.println("What is your weight in kilograms");








   /* System.out.println("first number+second number is "+ (firstNumber+secondNumber ));
        System.out.println("firstnumber + secondnumber "+ (secondNumber/firstNumber ));
        System.out.println("firstNumbern + secondNumber " + (firstNumber-secondNumber));
        System.out.println("firstNumber + seconNumber " + (secondNumber%firstNumber));
        System.out.println(firstNumber*secondNumber);
        System.out.println(total);
        total=total+10;
        System.out.println(total);
        System.out.println("What is your height ?(inches only)");
*/










    }
}
